import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = solve(s);
        System.out.println(ans);
    }

    static int solve(String s) {
        // ランレングス圧縮した文字列長-1が石を置く場所の数
        char[] cs = s.toCharArray();
        char before = '-';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            char at = cs[i];
            if (before != at) {
                if (at == 'W') {
                    sb.append('W');
                    before = 'W';
                } else {
                    sb.append('B');
                    before = 'B';
                }
            }
        }

        String ans = sb.toString();
        System.err.println(ans);
        if (ans.length() == 0) {
            return 0;
        } else {
            return ans.length() - 1;
        }
    }
}

