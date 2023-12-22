import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] x = new Integer[n];
        Arrays.setAll(x, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        int sum = Arrays.stream(x).mapToInt(i -> i).sum();
        int ave = (int) Math.ceil((double) sum / n);
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result += (x[i] - ave) * (x[i] - ave);
        }

        // 出力
        System.out.println(result);
    }
}
