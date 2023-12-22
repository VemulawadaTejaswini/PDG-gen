import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int num = x;
        int root = (int) Math.sqrt(num);
        while (num % root != 0) {
            num--;
            root = (int) Math.sqrt(num);
        }
        int result = root * root;

        // 出力
        System.out.println(result);
    }
}
