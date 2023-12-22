import java.util.*;

public class Main {

    private int H;
    private int W;
    private int D;
    private int[][] A;
    private int Q;
    private int[] L;
    private int[] R;
    private int[] posX;
    private int[] posY;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        D = sc.nextInt();
        A = new int[H][W];
        posX = new int[H * W];
        posY = new int[H * W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
                posX[A[i][j] - 1] = j;
                posY[A[i][j] - 1] = i;
            }
        }
        Q = sc.nextInt();
        L = new int[Q];
        R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
    }

    public void printAnswer() {
        int[] count = new int[Q];
        boolean[] full = new boolean[Q];
        for (int k = 0; k < Q; k++) {
            if (!full[k]) {
                int x = L[k];
                while (x != R[k]) {
                    count[k] += Math.abs(posX[x - 1] - posX[x - 1 + D]) + Math.abs(posY[x - 1] - posY[x - 1 + D]);
                    x += D;
                }
                full[k] = true;
                for (int j = k; j < Q; j++) {
                    if (L[j] == L[k] && R[j] == R[k]) {
                        full[j] = true;
                        count[j] = count[k];
                    }
                }
            }
            System.out.println(count[k]);
        }
    }

    public void run() {
        inputData();
        printAnswer();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
