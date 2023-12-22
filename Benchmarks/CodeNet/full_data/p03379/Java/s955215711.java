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
        Integer[] clone = x.clone();

        Arrays.sort(x);
        int centerL = x[(n / 2) - 1];
        int centerR = x[n / 2];

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            int num = clone[i];
            if (num <= centerL) {
                array[i] = Integer.toString(centerR);
            } else {
                array[i] = Integer.toString(centerL);
            }
        }

        String result = String.join("\n", array);

        // 出力
        System.out.println(result);
    }
}
