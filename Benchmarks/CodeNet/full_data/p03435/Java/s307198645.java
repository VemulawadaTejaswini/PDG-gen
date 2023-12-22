import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int c[][] = new int[3][3];
        int a1, a2, a3, b1, b2, b3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        a1 = Math.min(c[0][0], Math.min(c[0][1], c[0][2]));
        a2 = Math.min(c[1][0], Math.min(c[1][1], c[1][2]));
        a3 = Math.min(c[2][0], Math.min(c[2][1], c[2][2]));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int min = i == 0 ? a1 : i == 1 ? a2 : a3;
                c[i][j] -= min;
            }
        }

        for (int j = 0; j < 3; j++) {
            int tmp = c[0][j];
            for (int i = 1; i < 3; i++) {
                if (c[i][j] != tmp) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
