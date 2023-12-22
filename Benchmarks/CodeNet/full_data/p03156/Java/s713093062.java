import java.util.Scanner;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int cA = 0, cB = 0, cC = 0;
        for (int i = 0; i < N; i++) {
            final int P = sc.nextInt();
            if (P <= A)
                cA++;
            else if (P <= B)
                cB++;
            else
                cC++;
        }
        System.out.println(Math.min(cA, Math.min(cB, cC)));
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}
