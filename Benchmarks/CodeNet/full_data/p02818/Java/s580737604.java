import java.util.Scanner;

/**
 * Greedy Takahashi
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();

            if (K <= A) {
                A -= K;
            } else if (K <= A + B) {
                B -= K - A;
                A = 0;
            } else {
                A = 0;
                B = 0;
            }

            System.out.println(A + " " + B);
        }
    }

}
