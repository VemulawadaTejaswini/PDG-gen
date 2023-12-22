import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int H = sc.nextInt(), W = sc.nextInt(), D = sc.nextInt();
        int A[][] = new int[H * W + 1][2];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int num = sc.nextInt();
                A[num][0] = i;
                A[num][1] = j;
            }
        }
        int Q = sc.nextInt();
        int[] L = new int[Q], R = new int[Q];
        for (int i = 0; i < Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        int[] costs = new int[H * W + 1];
        for (int i = H * W; i > 0; i--) {
            if (i + D > H * W) {
                costs[i] = 0;
            } else {
                costs[i] = costs[i + D] + Math.abs(A[i + D][0] - A[i][0]) + Math.abs(A[i + D][1] - A[i][1]);
            }
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(costs[L[i]] - costs[R[i]]);
        }
    }
}
