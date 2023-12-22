import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long N = 0;
        int ans = (int) 1e9;
        N = scanner.nextLong();
        long A = 1;
        long B = 1;
        for (A = 1; A <= Math.sqrt(N); A++) {
            B = N / A;
            if (A * B == N) {
                ans = Math.min(ans, String.valueOf(Math.max(A, B)).length());
            }

        }
        System.out.println(ans);
    }
}
