import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        boolean ns = true;
        if (0 <= s.indexOf("N") || 0 <= s.indexOf("S")) {
            ns = (0 <= s.indexOf("N") && 0 <= s.indexOf("S"));
        }
        boolean ew = true;
        if (0 <= s.indexOf("E") || 0 <= s.indexOf("W")) {
            ew = (0 <= s.indexOf("E") && 0 <= s.indexOf("W"));
        }
        String result = ns && ew ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        boolean ns = true;
        if (0 <= s.indexOf("N") || 0 <= s.indexOf("S")) {
            ns = (0 <= s.indexOf("N") && 0 <= s.indexOf("S"));
        }
        boolean ew = true;
        if (0 <= s.indexOf("E") || 0 <= s.indexOf("W")) {
            ew = (0 <= s.indexOf("E") && 0 <= s.indexOf("W"));
        }
        String result = ns && ew ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}