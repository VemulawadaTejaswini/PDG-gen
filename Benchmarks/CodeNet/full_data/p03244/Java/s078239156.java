import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int v1[][] = new int[100001][2];
        int v2[][] = new int[100001][2];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                int s = sc.nextInt();
                v1[s][0] = s;
                v1[s][1]++;
            } else {
                int s = sc.nextInt();
                v2[s][0] = s;
                v2[s][1]++;
            }
        }

        srt2DArray(v1);
        srt2DArray(v2);

        if(v1[0][0] == v2[0][0]) {
            boolean ss = false; // first convert
            for (int i = 0; i < 100001; i++) {
                if (v1[i][1] < v2[i][1]) {
                    break;
                } else if (v1[i][1] > v2[i][1]) {
                    ss = true;
                    break;
                }
            }

            if (!ss) {
                System.out.println(n / 2 - v1[0][1] + n / 2 - v2[1][1]);
            } else {
                System.out.println(n / 2 - v1[1][1] + n / 2 - v2[0][1]);
            }
        } else {
            System.out.println(n / 2 - v1[0][1] + n / 2 - v2[0][1]);
        }
    }

    static void srt2DArray(int[][] array) {
        Arrays.sort(array, (a, b) -> {
            if (a[1] > b[1]) {
                return -1;
            } else if (a[1] == b[1]) {
                return 0;
            } else {
                return 1;
            }
        });
    }
}
