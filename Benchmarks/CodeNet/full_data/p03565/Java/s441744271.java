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
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sLen; i++) sb.append(s[i]);
        String res = sb.toString();

        for (int i = 0; i <= sLen - tLen; i++) {
            if (s[i] == t[0] && checkSub(i, tLen, s, t)) {
                StringBuilder asb = new StringBuilder();
                for(int j = 0; j < i; j++) {
                    if(s[j] == '?') asb.append('a');
                    else asb.append(s[j]);
                }

                for (int j = i; j < i + tLen; j++) {
                    if(s[j] == '?') asb.append(t[j - i]);
                    else asb.append(s[j]);
                }

                for (int j = i + tLen; j < sLen; j++) {
                    if(s[j] == '?') asb.append('a');
                    else asb.append(s[j]);
                }
                String ans = asb.toString();
                found = true;
                if (res.compareTo(ans) < 0) res = ans;
            }
        }
        if (found) System.out.println(res);
        else System.out.println("UNRESTORABLE");
    }

    public static boolean checkSub(int idx, int tLen, char[]s, char[] t) {
        boolean res = true;
        for(int i = 1; i < tLen; i++) {
            if (s[idx + i] != t[i] && s[idx + i] != '?') res = false; break;
        }
        return res;
    }

}
