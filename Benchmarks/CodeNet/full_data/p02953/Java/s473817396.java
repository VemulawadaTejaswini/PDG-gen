import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = in.nextInt();
            }

            for (int i = N - 2; i >= 0; i--) {
                if (H[i] <= H[i + 1]) {
                    continue;
                } else if (H[i] - 1 <= H[i + 1]) {
                    H[i]--;
                    continue;
                } else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
