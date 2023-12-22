import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        String[] a = new String[n];
        String[] b = new String[m];
        Arrays.setAll(a, i -> sc.next());
        Arrays.setAll(b, i -> sc.next());
        sc.close();

        // 主処理
        boolean judge = false;
        for (int i = 0; i <= n - m; i++) {
            int index = a[i].indexOf(b[0], 0);
            while (0 <= index && index <= n - m) {
                boolean isSame = true;
                for (int j = 1; j < m; j++) {
                    if (a[j].charAt(index) != b[j].charAt(index)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    judge = true;
                    break;
                } else {
                    index = a[i].indexOf(b[i], index + 1);
                }
            }
        }
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
