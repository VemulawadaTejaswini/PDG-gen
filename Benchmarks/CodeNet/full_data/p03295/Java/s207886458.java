import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int req[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            req[i][0] = a;
            req[i][1] = b;
        }
        Arrays.sort(req, (a, b) -> {
            if (a[0] > b[0]) {
                return 1;
            }
            if (a[0] == b[0] && a[1] > b[1]) {
                return 1;
            } else {
                return -1;
            }
        });
        int count = 1;
        int start = req[0][0], end = req[0][1];
        for (int i = 1; i < m; i++) {
            start = Math.max(start, req[i][0]);
            end = Math.min(end, req[i][1]);
            if (end <= start) {
                count++;
                start = req[i][0];
                end = req[i][1];
            }
        }
        System.out.println(count);

    }
}
