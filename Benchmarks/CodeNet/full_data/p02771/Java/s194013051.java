import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            boolean poor = false;

            if (A == B && A != C) {
                poor = true;
            }

            if (B == C && B != A) {
                poor = true;
            }

            if (C == A && C != B) {
                poor = true;
            }

            if (poor) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
