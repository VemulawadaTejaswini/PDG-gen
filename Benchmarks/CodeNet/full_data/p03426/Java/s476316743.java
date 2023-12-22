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

        for (int i = 0; i < Q; i++) {
            int current = L[i];
            int cost = 0;
            while (current != R[i]) {
                cost += Math.abs(A[current + D][0] - A[current][0]) + Math.abs(A[current + D][1] - A[current][1]);
                current += D;
            }
            System.out.println(cost);
        }
    }
}
