import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Arrays.sort(a, Collections.reverseOrder());
        List<Long> list = new ArrayList<>();
        int num = a[0];
        for (int i = 1; i < n; i++) {
            list.add(combination(num, a[i]));
        }

        long max = list.stream().mapToLong(i -> i).max().orElse(0);
        int index = list.indexOf(max) + 1;
        String result = num + " " + a[index];

        // 出力
        System.out.println(result);
    }

    public static long combination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
