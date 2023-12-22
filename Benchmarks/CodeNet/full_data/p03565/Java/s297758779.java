import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        System.out.println(solve(S, T));
    }

    private static String solve(String S, String T) {
        for (int i = S.length()-1; i >= 0; i--) {
            if( isOk(S, T, i) ) {
                return calc(S, T, i);
            }
        }
        return "UNRESTORABLE";
    }

    private static boolean isOk(String S, String T, int i) {
        String sub = S.substring(i);
        if( sub.length() < T.length() ) return false;
        for (int j = 0; j < sub.length(); j++) {
            if (sub.charAt(j) != '?' && T.charAt(j) != sub.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static String calc(String S, String T, int i) {
        String prev = S.substring(0, i);
        String post = S.substring(i + T.length());

        return prev.replace('?', 'a') + T + post.replace('?', 'a');
    }
}
