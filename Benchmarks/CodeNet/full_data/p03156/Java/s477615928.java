import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = in.nextInt();
            }

            int[] count = new int[3];
            for (int i = 0; i < N; i++) {
                count[P[i] < A ? 0 : P[i] < B ? 1 : 2]++;
            }

            System.out.println(Math.min(count[0], Math.min(count[1], count[2])));
        }
    }
}
