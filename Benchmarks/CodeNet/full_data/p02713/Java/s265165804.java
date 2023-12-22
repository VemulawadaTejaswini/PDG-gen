import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int j2 = 1; j2 <= n; j2++) {
                    result += gcd3(i, j, j2);
                }
            }
        }

        // 出力
        System.out.println(result);
    }

    public static int gcd3(int a, int b, int c) {

        int bc = gcd(b, c);

        int temp;
        while ((temp = a % bc) != 0) {
            a = bc;
            bc = temp;
        }
        return bc;
    }

    public static int gcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
