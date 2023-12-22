import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] H = new long[N];

            for (int i = 0; i < N; i++) {
                H[i] = sc.nextLong();
            }

            H[0] = H[0] - 1;
            for (int i = 1; i < N; i++) {
                if (H[i] > H[i - 1]) {
                    H[i] = H[i] - 1;
                }

                if (H[i] < H[i - 1]) {
                    System.out.println("No");
                    System.exit(0);
                }
            }

            System.out.println("Yes");
        }
    }

}
