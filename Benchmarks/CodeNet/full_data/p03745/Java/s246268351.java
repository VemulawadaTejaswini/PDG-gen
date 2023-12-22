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
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                list.add(a[i]);
            }
        }
        if (a[n - 1] != a[n - 2]) {
            list.add(a[n - 1]);
        }

        int result = 1;
        for (int i = 1; i < list.size() - 1; i++) {
            int center = list.get(i);
            int left = list.get(i - 1);
            int right = list.get(i + 1);
            if (center < left && center < right || left < center && right < center) {
                result++;
                i++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
