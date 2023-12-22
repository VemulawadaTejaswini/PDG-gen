import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] A = new int[N];
        String[] strA = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strA[i]);
        }
        int[] leftGcd = new int[N - 1];
        leftGcd[0] = A[0];
        for (int i = 0; i < N - 2; i++) {
            leftGcd[i + 1] = gcd(leftGcd[i], A[i + 1]);
        }
        int[] rightGcd = new int[N - 1];
        rightGcd[N - 2] = A[N - 1];
        for (int i = N - 3; 0 <= i; i--) {
            rightGcd[i] = gcd(A[i + 1], rightGcd[i + 1]);
        }
        int[] allGcd = new int[N];
        allGcd[0] = rightGcd[0];
        for (int i = 0; i < N - 2; i++) {
            allGcd[i + 1] = gcd(leftGcd[i], rightGcd[i + 1]);
        }
        allGcd[N - 1] = leftGcd[N - 2];
        int max = 0;
        for (int cur : allGcd) {
            if (max < cur) {
                max = cur;
            }
        }
        System.out.println(max);
    }

    private static int gcd(int a, int b) {
        int r = a % b;
        return (r == 0) ? b : gcd(b, r);
    }
}
