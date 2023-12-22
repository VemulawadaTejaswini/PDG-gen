import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        Arrays.setAll(s, i -> sc.next());
        sc.close();

        // 主処理
        int result = 0;
        int countEndA = 0;
        int countStartB = 0;
        int countEndAStartB = 0;
        for (int i = 0; i < n; i++) {
            String replaced = s[i].replace("AB", "");
            result += (s[i].length() - replaced.length()) / 2;
            boolean isEndA = replaced.endsWith("A");
            boolean isStartB = replaced.startsWith("B");
            if (isEndA && isStartB) {
                countEndAStartB++;
                countEndA++;
                countStartB++;
            } else {
                if (isEndA) {
                    countEndA++;
                }
                if (isStartB) {
                    countStartB++;
                }
            }
        }
        if (countEndA == countStartB) {
            if (countEndA == countEndAStartB) {
                result += countEndAStartB - 1;
            } else {
                result += countEndA;
            }
        } else {
            result += Math.min(countEndA, countStartB);
        }
        result = Math.max(result, 0);

        // 出力
        System.out.println(result);
    }
}
