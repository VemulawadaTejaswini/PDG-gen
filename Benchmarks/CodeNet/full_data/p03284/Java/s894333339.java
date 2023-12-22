import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        // 主処理
        int min = n / k;
        int max = (int) Math.ceil((double) n / k);
        int result = max - min;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
