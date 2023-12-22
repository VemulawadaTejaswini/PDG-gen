import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            h[i] = Integer.parseInt(sc.next());
        }

        // (Cx, Cy) について、(0, 0) から (100, 100) まで全探索
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                boolean ok = true;
                int ch = 0;
                for (int k = 0; k < n; k++) {
                    // h が 0 の場合は一意に定まらないのでスキップ
                    if (h[k] == 0) continue;
                    int tmp = Math.abs(x[k] - i) + Math.abs(y[k] - j) + h[k];
                    if (ch == 0) {
                        ch = tmp;
                    }
                    if (ch != tmp) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    System.out.printf("%d %d %d\n", i, j, ch);
                }
            }
        }
    }
}
