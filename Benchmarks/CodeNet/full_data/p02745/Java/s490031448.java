import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String c = in.next();
        int min = Integer.MAX_VALUE;
        min = Math.min(min, minLength3(a, b, c));
        min = Math.min(min, minLength3(a, c, b));
        min = Math.min(min, minLength3(b, a, c));
        min = Math.min(min, minLength3(b, c, a));
        min = Math.min(min, minLength3(c, b, a));
        min = Math.min(min, minLength3(c, a, b));
        System.out.println(min);
    }
    public static int minLength3(String a, String b, String c) {
        String c1 = concat(a, b);
        String c2 = concat(c1, c);
        return c2.length();
    }
    public static String concat(String a, String b) {
        int len = Math.min(a.length(), b.length());
        char aLast = a.charAt(a.length()-1);
        int maxMatch = 0;
        for(int match=len; match>=1; match--) {
            char cb = b.charAt(match-1);
            if(aLast=='?' || cb=='?' || aLast==cb) {
                boolean matched = true;
                for(int i=1; i<=match; i++) {
                    char ca2 = a.charAt(a.length()-i);
                    char cb2 = b.charAt(match-i);
                    if(ca2!='?' && cb2!='?' && ca2!=cb2) {
                        matched = false;
                        break;
                    }
                }
                if(matched) {
                    maxMatch = match;
                    break;
                }
            }
        }
        return a+(b.substring(maxMatch));
    }
}
