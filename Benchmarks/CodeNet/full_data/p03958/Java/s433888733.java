import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        Integer[] a = new Integer[t];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int max = Arrays.stream(a).mapToInt(i -> i).max().orElse(0);
        int sum = Arrays.stream(a).mapToInt(i -> i).sum();
        int result = Math.max(0, max - (sum - max + 1));

        // 出力
        System.out.println(result);
    }
}
