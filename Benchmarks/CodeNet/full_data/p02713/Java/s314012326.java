import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int gcd = 0;

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    gcd += gcd(gcd(j, k), i);
                }
            }
        }

        System.out.println(gcd);
        s.close();
    }

    public static int gcd(int p, int q) {
        if (p % q == 0) {
            return q;
        }
        return gcd(q, p % q);
    }
}