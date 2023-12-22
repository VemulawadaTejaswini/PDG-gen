import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();
            long A1 = sc.nextLong();
            long A2 = sc.nextLong();
            long B1 = sc.nextLong();
            long B2 = sc.nextLong();

            if ((A1 * T1 + A2 * T2) == (B1 * T1 + B2 * T2)) {
                System.out.println("infinity");
                return;
            }

            if (A1 > B1) {
                A1 = A1 - B1;
                B2 = B2 - A2;
            } else {
                A1 = B1 - A1;
                B2 = A2 - B2;
            }

            long d1 = A1 * T1;
            long d2 = B2 * T2;

            if (d1 - d2 > 0) {
                System.out.println(0);
                return;
            }

            long ans = (d1 / (d2 - d1)) * 2;

            if (d1 % (d2 - d1) != 0) {
                ans++;
            }

            System.out.println(ans);
        }
    }

}
