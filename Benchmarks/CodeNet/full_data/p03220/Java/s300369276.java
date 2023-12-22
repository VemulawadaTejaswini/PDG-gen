import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int T = in.nextInt();
            int A = in.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = in.nextInt();
            }

            int bestI = -1;
            double bestDistance = (int) 1e9;
            for (int i = 0; i < N; i++) {
                double t = T - H[i] * 0.006;
                if (Math.abs(t - A) < bestDistance) {
                    bestDistance = Math.abs(t - A);
                    bestI = i;
                }
            }

            System.out.println(bestI + 1);
        }
    }
}
