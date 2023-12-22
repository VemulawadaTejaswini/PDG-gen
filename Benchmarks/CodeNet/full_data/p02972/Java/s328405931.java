import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static final int MOD = 2;

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0 ; i < N ; i++){
            a[i] = sc.nextInt();
        }

        final Solver solver = new Solver();
        solver.solve(N, a);
    }
}

class Solver {
    public void solve(int N, int[] a) {
        int[] ans = new int[N];
        List<Integer> balls = new ArrayList<>();
        for (int i = N - 1; i >= 0; i--) {
            int s = sum(N, ans, i) % 2;

            boolean put = s != a[i];
            if (put) {
                ans[i] = 1;
                balls.add(i + 1);
            }
            else {
                ans[i] = 0;
            }
        }

        System.out.println(balls.size());
        System.out.println(
                balls.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
    }

    private int sum(int N, int[] a, int cur) {
        int step = cur + 1;
        int sum = 0;
        for (int i = cur + step; i < N; i+=step) {
            sum += a[i];
        }
        return sum;
    }
}

