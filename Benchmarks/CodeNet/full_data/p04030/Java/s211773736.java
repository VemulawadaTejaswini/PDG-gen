import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] cs = s.toCharArray();

        String ans = "";
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 'B') {
                if (ans.length() != 0) {
                    ans = ans.substring(0, ans.length() - 1);
                }
            } else {
                ans += cs[i];
            }
        }
        System.out.println(ans);
    }
}
