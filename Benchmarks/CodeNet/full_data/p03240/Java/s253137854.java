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
                int ch = Math.abs(x[0] - i) + Math.abs(y[0] - j) + h[0];
                for (int k = 1; k < n; k++) {
                    int tmp = Math.abs(x[k] - i) + Math.abs(y[k] - j) + h[k];
                    if (ch == tmp) {
                        continue;
                    }
 
                    ok = false;
                    break;
                }
                if (ok) {
                    System.out.printf("%d %d %d\n", i, j, ch);
                    return;
                }
            }
        }
    }
}