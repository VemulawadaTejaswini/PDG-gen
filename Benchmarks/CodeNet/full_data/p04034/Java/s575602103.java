import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] x = new Integer[m];
        Integer[] y = new Integer[m];
        for (int i = 0; i < m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int[] white = new int[n + 1];
        Arrays.fill(white, 1);
        int[] red = new int[n + 1];
        red[1]++;
        white[1]--;

        int[] ball = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int before = x[i];
            int after = y[i];

            if (white[before] + red[before] == 1) { // ボールが1個の場合
                if (white[before] == 1) {
                    white[before]--;
                    white[after]++;
                } else {
                    red[before]--;
                    red[after]++;
                }
                ball[before] = 0;

            } else if (0 < white[before] && red[before] == 0) { // 白しかない場合
                white[before]--;
                white[after]++;

            } else if (0 < red[before]) { // 赤がある場合
                ball[before] = 1;
                ball[after] = 1;
                red[before]--;
                red[after]++;
            }
        }

        int sum = Arrays.stream(ball).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }
}
