import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        Integer[] x = new Integer[n];
        Integer[] y = new Integer[n];
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int minH = 0;
        int maxH = h;
        int minW = 0;
        int maxW = w;

        for (int i = 0; i < n; i++) {
            int operation = a[i];
            if (operation == 1) {
                minW = x[i];
            } else if (operation == 2) {
                maxW = x[i];
            } else if (operation == 3) {
                minH = y[i];
            } else if (operation == 4) {
                maxH = y[i];
            }
        }

        int height = Math.max(0, maxH - minH);
        int width = Math.max(0, maxW - minW);

        int result = height * width;

        // 出力
        System.out.println(result);
    }
}
