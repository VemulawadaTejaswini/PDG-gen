import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int ans = solve(S);
        System.out.println(ans);

    }

    private static int solve(String s) {
        char[] sn = s.toCharArray();
        int white = count(sn, '0', '1');
        int black = count(sn, '1', '0');
        return Math.min(white, black);
    }

    private static int count(char[] sn, char match, char counterpart) {
        int cnt = 0;
        for (int i = 0; i < sn.length; i++) {
            if (i % 2 == 0 && sn[i] == counterpart) {
                cnt++;
            }
            if (i % 2 == 1 && sn[i] == match) {
                cnt++;
            }
        }
        return cnt;
    }
}
