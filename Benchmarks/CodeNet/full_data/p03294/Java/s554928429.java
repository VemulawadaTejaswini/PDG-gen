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
        int[] mod = Arrays.stream(a).mapToInt(i -> i = i - 1).toArray();
        int sum = Arrays.stream(mod).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }
}
