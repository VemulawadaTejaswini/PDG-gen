import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int N = sc.nextInt();
        int A[][] = new int[2][N];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (j < i) {
                    sum += A[0][j];
                } else if (i == j) {
                    sum += A[0][j] + A[1][j];
                } else {
                    sum += A[1][j];
                }
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
}
