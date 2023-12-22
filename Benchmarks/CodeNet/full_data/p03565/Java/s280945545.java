import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int sLen = s.length();
        int tLen = t.length();

        int i = sLen - tLen;
        for(; i>= 0; i--) {
            if(isValid(s, i, t))
                break;
        }
        if(i == -1)
            System.out.println("UNRESTORABLE");
        else {
            String str = mkResult(s, t, i);
            System.out.println(str);
        }
    }

    private static String mkResult(String s, String t, int idx) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(idx <= i && i < idx + t.length())
                sb.append(t.charAt(i - idx));
            else if(s.charAt(i) == '?')
                sb.append('a');
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private static boolean isValid(String s, int idx, String t) {
        int i = 0;
        while(i < t.length()) {
            if(s.charAt(idx+i) == '?' || s.charAt(idx+i) == t.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return i == t.length();
    }
}
