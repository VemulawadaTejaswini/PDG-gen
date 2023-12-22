import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A);
        int sum = Arrays.stream(A).sum();
        List<Integer> divisors = this.divisors(sum);
        divisors.sort(Comparator.reverseOrder());
        for (int ans : divisors) {
            if (possible(N, K, A, ans)) {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(1);
    }
    private boolean possible(int N, int K, int[] A, int candidate) {
        int[] mod = new int[N];
        for (int i = 0; i < N; i++) {
            mod[i] = A[i] % candidate;
        }
        Arrays.sort(mod);
        int[] diff = new int[N];
        for (int i = 0; i < N; i++) {
            diff[i] = candidate - mod[i];
        }
        int[] sumL = new int[N+2];
        for (int i = 0; i < N; i++) {
            sumL[i+1] = sumL[i] + mod[i];
        }
        sumL[N+1] = sumL[N];
        int[] sumR = new int[N+2];
        for (int i = N; 1 <= i; i--) {
            sumR[i] = sumR[i+1] + diff[i-1];
        }
        sumR[0] = sumR[1];
        long min = Long.MAX_VALUE;
        for (int right = 1; right <= N; right++) {
            long temp = sumL[right-1];
            if (K < temp) {
                continue;
            }
            temp -= sumR[right];
            if (0 == temp) {
                min = Math.min(min, temp);
            }
        }
        return min != Long.MAX_VALUE;
    }
    private List<Integer> divisors(int sum) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= sum; i++) {
            if (sum % i != 0) {
                continue;
            }
            divisors.add(i);
            if (i != sum / i) {
                divisors.add(sum / i);
            }
        }
        return divisors;
    }
}
