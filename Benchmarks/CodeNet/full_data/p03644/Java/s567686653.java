import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        Integer[] num = new Integer[] { 2, 4, 8, 16, 32, 64 };
        Arrays.sort(num, Collections.reverseOrder());
        int result = 1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= n) {
                result = num[i];
                break;
            }
        }

        // 出力
        System.out.println(result);
    }
}
