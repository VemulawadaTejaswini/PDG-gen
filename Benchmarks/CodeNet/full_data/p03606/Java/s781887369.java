import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        Integer[] r = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += r[i] - l[i] + 1;
        }

        // 出力
        System.out.println(result);
    }
}
