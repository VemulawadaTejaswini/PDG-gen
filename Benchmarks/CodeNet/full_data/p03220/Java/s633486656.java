import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static float avgTemp(final int T, final int x) {
        return (T - x * 0.006f);
    }

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            final int N = in.nextInt();
            final int T = in.nextInt();
            final int A = in.nextInt();

            int bestIdx = -1;
            float minDiff = Float.POSITIVE_INFINITY;
            for (int i = 0; i < N; ++i) {
                final int Hi = in.nextInt();
                float diff = Math.abs(avgTemp(T, Hi) - A);
                if (diff < minDiff) {
                    bestIdx = i;
                    minDiff = diff;
                }
            }
            out.println(bestIdx + 1);
        }
    }
}
