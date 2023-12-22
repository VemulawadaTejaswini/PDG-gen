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
        int result = (int) Math.pow(3, n);
        int evenCount = Arrays.stream(a).filter(i -> i % 2 == 0).toArray().length;
        int minus = (int) Math.pow(2, evenCount);
        result -= minus;

        // 出力
        System.out.println(result);
    }
}
