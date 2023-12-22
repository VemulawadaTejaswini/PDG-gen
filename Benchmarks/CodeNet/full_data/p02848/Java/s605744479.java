import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();
        String ans2 = "";

        for (int i = 0; i < S.length(); i++) {
            if (((int) (S.charAt(i))) + n < 91) {
                ans2 = ans2 + String.valueOf((char) (S.charAt(i) + n));

            } else {
                ans2 = ans2 + String.valueOf((char) (S.charAt(i) + n -26));

            }
        }
        // 出力
        System.out.println(ans2);
    }
}
