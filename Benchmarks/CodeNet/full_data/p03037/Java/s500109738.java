import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] l = new Integer[m];
        Integer[] r = new Integer[m];
        for (int i = 0; i < m; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int max = Arrays.stream(l).mapToInt(i -> i).max().getAsInt();
        int min = Arrays.stream(r).mapToInt(i -> i).min().getAsInt();
        int result = Math.max(0, min - max + 1);

        // 出力
        System.out.println(result);
    }
}
