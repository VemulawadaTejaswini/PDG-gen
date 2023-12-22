import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer q = Integer.parseInt(sc.next());
        String s = sc.next();
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        String[] arr = s.split("");
        String[] count = new String[q];
        for (int i = 0; i < q; i++) {
            String target = "";
            for (int j = l[i] - 1; j < r[i]; j++) {
                target += arr[j];
            }
            String deleted = target.replace("AC", "");
            count[i] = Integer.toString((target.length() - deleted.length()) / 2);
        }

        String result = String.join("\r\n", count);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
