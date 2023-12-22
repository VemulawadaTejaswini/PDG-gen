import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] X = new int[N];
            int[] Y = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
                Y[i] = in.nextInt();
            }

            for (int i = 1; i < N; i++) {
                if ((X[i - 1] + Y[i - 1]) % 2 != (X[i] + Y[i]) % 2) {
                    System.out.println(-1);
                    return;
                }
            }

            int max = 0;
            for (int i = 1; i < N; i++) {
                max = Math.max(max, Math.abs(X[i]) + Math.abs(Y[i]));
            }

            System.out.println(max);
            for (int i = 0; i < max; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(1);
            }
            System.out.println();

            for (int i = 0; i < N; i++) {
                int x = 0;
                int y = 0;
                for (int j = 0; j < max; j++) {
                    if (x < X[i]) {
                        System.out.print("R");
                        x++;
                        continue;
                    }
                    if (x > X[i]) {
                        System.out.print("L");
                        x--;
                        continue;
                    }
                    if (y < Y[i]) {
                        System.out.print("U");
                        y++;
                        continue;
                    }
                    if (y > Y[i]) {
                        System.out.print("D");
                        y--;
                        continue;
                    }
                    {
                        System.out.print("D");
                        y--;
                        continue;
                    }
                }
                System.out.println();
            }

        }
    }
}
