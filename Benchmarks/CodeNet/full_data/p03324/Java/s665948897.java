import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        //
        int pow = 1;
        for (int i = 0; i < d; i++) {
            pow *= 100;
        }
        int result = pow * n;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
