import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int sLen = S.length();
        int tLen = T.length();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        java.lang.String res = "";
        for (int i = 0; i < sLen - tLen + 1; i++) {
            if (!check(s, t, i)) {
                continue;
            }
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < i; j++) {
                builder.append(s[j] == '?' ? 'a' : s[j]);
            }
            for (int j = i; j < i + tLen; j++) {
                builder.append(t[j - i]);
            }
            for (int j = i + tLen; j < sLen; j++) {
                builder.append(s[j] == '?' ? 'a' : s[j]);
            }
            String temp = builder.toString();
            res = temp;
        }
        if (res == "") System.out.println("UNRESTORABLE");
        else System.out.println(res);

    }
    private static boolean check(char[] s, char[] t, int index) {
        for (int i = index; i < index + t.length; i++) {
            if (s[i] == '?') {
                continue;
            }
            if (s[i] != t[i-index]) {
                return false;
            }
        }
        return true;
    }
}
