import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            if (K == 1) {
                System.out.println(0);
                return;
            }
            System.out.println(N - K);
        }
    }
}
