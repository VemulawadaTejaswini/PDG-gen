import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        // 主処理
        boolean isSiritori = (a.charAt(a.length() - 1) == b.charAt(0)) && (b.charAt(b.length() - 1) == c.charAt(0));
        String result = isSiritori ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}