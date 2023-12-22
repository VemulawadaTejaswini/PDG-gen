import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int K = in.nextInt();

            int sum = A + B + C;
            int max = Math.max(A, Math.max(B, C));
            sum += -max + (max << K);

            System.out.println(sum);
        }
    }
}
