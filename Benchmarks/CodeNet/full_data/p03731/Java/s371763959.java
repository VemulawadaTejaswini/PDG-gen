import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            long T = sc.nextLong();
            long[] t = new long[N + 2];
            t[0] = 0;
            t[N + 1] = Long.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                t[i + 1] = sc.nextLong();
            }

            long ans = 0;
            for (int i = 1; i < N + 2; i++) {
                long diff = t[i] - t[i - 1];
                long plus = diff > T ? T : diff;
                ans += plus;
            }
            System.out.println(ans);
        }
    }
}
