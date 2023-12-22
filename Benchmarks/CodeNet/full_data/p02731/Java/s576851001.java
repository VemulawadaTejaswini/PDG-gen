import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();

        long ans = Long.MIN_VALUE;
        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= L; j++) {
                final int k = L - i - j;
                ans = Math.max(ans, i*j*k);
            }
        }

        System.out.println(ans);
    }
}
