import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            if (A > B) {
                System.out.println(0);
                return;
            }
            if (N == 1 && A != B) {
                System.out.println(0);
                return;
            }
            if (N <= 2) {
                System.out.println(1);
                return;
            }
            long res = (B - A) * (N - 2L) + 1L;
            System.out.println(res);
        }
    }
}
