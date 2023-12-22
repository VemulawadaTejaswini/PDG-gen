import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        Long[] a = new Long[n];
        Arrays.setAll(a, i -> Long.parseLong(sc.next()));
        sc.close();

        // 主処理
        int result = 0;
        long sum = Arrays.stream(a).mapToLong(i -> i).sum();
        if (x < sum) {
            Arrays.sort(a);
            long num = 0;
            for (int i = 0; i < a.length; i++) {
                num += a[i];
                if (num <= x) {
                    result++;
                }
            }
        } else if (sum < x) {
            result = n - 1;
        } else {
            result = n;
        }

        // 出力
        System.out.println(result);
    }
}
