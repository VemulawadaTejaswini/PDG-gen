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
        for (int i = sLen - tLen; i >= 0; i--) {
            if (s[i] == t[0] && checkComp(i, tLen, s, t)) {
                fillCharArrayWithA(s, sLen);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(String.valueOf(s));
        } else {
            for (int i = sLen - tLen; i >= 0; i--) {
                if (s[i] == t[0] && checkSub(i, tLen, s, t)) {
                    System.out.println("FOUND");
                    replaceCharArray(s, t, i, tLen);
                    fillCharArrayWithA(s, sLen);
                    found = true;
                    break;
                }
            }
            if (found) System.out.println(String.valueOf(s));
            else System.out.println("UNRESTORABLE");
        }
    }

    public static boolean checkComp(int idx, int tLen, char[] s, char[] t) {
        boolean res = true;
        for(int i = 1; i < tLen; i++) {
            if (s[idx + i] != t[i]) res = false; break;
        }

        return res;
    }

    public static boolean checkSub(int idx, int tLen, char[]s, char[] t) {
        boolean res = true;
        for(int i = 1; i < tLen; i++) {
            if (s[idx + i] != t[i] && s[idx + i] != '?') res = false; break;
        }
        return res;
    }
    public static void fillCharArrayWithA(char[] s, int sLen) {
        for(int i = 0; i < sLen; i++) {
            if(s[i] == '?') s[i] = 'a';
        }
    }

    public static void replaceCharArray(char[] s, char[] t, int idx, int tLen) {
        int tIdx = 1;
        for (int i = idx + 1; i < tLen + idx; i++) {
            if(s[i] == '?') s[i] = t[tIdx];
            tIdx++;
        }
    }
}