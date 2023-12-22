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
    private int[][] score;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        D = sc.nextInt();
        A = new int[H][W];
        posX = new int[H * W];
        posY = new int[H * W];
        score = new int[H * W][H * W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = sc.nextInt();
                posX[A[i][j] - 1] = j;
                posY[A[i][j] - 1] = i;
            }
        }
        for (int i = 0; i < H * W; i++) {
            for (int j = 0; j < H * W; j++) {
                score[i][j] = Integer.MAX_VALUE;
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
        for (int k = 0; k < Q; k++) {
            if (score[L[k] - 1][R[k] - 1] != Integer.MAX_VALUE) {
                System.out.println(score[L[k]][R[k]]);
            } else {
                int count = 0;
                int x = L[k];
                while (x != R[k]) {
                    count += Math.abs(posX[x - 1] - posX[x - 1 + D]) + Math.abs(posY[x - 1] - posY[x - 1 + D]);
                    x += D;
                }
                System.out.println(count);
                score[L[k] - 1][R[k] - 1] = count;
            }
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
