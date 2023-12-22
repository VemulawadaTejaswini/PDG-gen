import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            q[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        String target = "";
        String strP = "";
        String strQ = "";
        for (int i = 0; i < n; i++) {
            target += (i + 1);
            strP += p[i];
            strQ += q[i];
        }
        List<String> targetList = permutation(target);

        int a = targetList.indexOf(strP);
        int b = targetList.indexOf(strQ);   
        int result = Math.abs(a - b);

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static List<String> permutation(String q) {
        return permutation(q, "");
    }

    private static List<String> permutation(String q, String ans) {
        List<String> list = new ArrayList<>();
        if (q.length() <= 1) {
            list.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                list.addAll(permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i)));
            }
        }
        return list;
    }
}