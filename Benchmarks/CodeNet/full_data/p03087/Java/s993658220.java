import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next()); // 未使用となる変数n
        Integer q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        int[] acIndex = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if ('A' == s.charAt(i) && 'C' == s.charAt(i + 1)) {
                acIndex[i] = 1;
            } else {
                acIndex[i] = 0;
            }
        }

        String[] count = new String[q];
        for (int i = 0; i < q; i++) {
            int[] target = Arrays.copyOfRange(acIndex, l[i] - 1, r[i] - 1);
            count[i] = Integer.toString(Arrays.stream(target).sum());
        }

        String result = String.join("\r\n", count);

        // 出力
        System.out.println(result);
        sc.close();
    }    
}
