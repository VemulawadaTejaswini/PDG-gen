import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int result = 0;
        for (int i = n - 1; 0 <= i; i--) {
            int numA = a[i] + result;
            int numB = b[i];
            if (numA <= numB) {
                int inc = numB - numA;
                result += inc;
            } else {
                int div = (int) Math.ceil((double) numA / numB);
                int inc = div * numB - numA;
                result += inc;
            }

        }

        // 出力
        System.out.println(result);
    }
}
