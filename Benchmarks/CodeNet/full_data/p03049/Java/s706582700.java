import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // 主処理
        int count = 0;
        int countEndA = 0;
        int countStartB = 0;
        for (int i = 0; i < n; i++) {
            count += (s[i].length() - s[i].replace("AB", "").length()) / 2;
            if (s[i].endsWith("A")) {
                countEndA++;
            }
            if (s[i].startsWith("B")) {
                countStartB++;
            }
        }
        int CountJoinAB = Math.min(countEndA, countStartB);
        int result = count + CountJoinAB;
        if (n == CountJoinAB) {
            result--;
        }

        // 出力
        System.out.println(result);
    }
}
