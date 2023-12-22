import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
            }

            int Cx = -1;
            int Cy = -1;
            int Ch = -1;
            for (int X = 0; X <= 100; X++) {
                YLoop: for (int Y = 0; Y <= 100; Y++) {
                    int H = -1;
                    for (int i = 0; i < N; i++) {
                        if (h[i] <= 0) {
                            continue;
                        }
                        H = h[i] + Math.abs(x[i] - X) + Math.abs(y[i] - Y);
                        if (H > 0) {
                            break;
                        }
                    }
                    for (int i = 0; i < N; i++) {
                        if (h[i] != h(X, Y, H, x[i], y[i])) {
                            continue YLoop;
                        }
                    }
                    Cx = X;
                    Cy = Y;
                    Ch = H;
                }
            }

            System.out.println(Cx + " " + Cy + " " + Ch);

        }
    }

    private static int h(int X, int Y, int H, int x, int y) {
        return Math.max(H - Math.abs(x - X) - Math.abs(y - Y), 0);
    }

}
