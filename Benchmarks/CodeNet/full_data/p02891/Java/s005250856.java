import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        String s2 = s+s;
        long k = in.nextLong();
        int cPerS = 0;
        boolean isAllSame = true;
        for(int i=1; i<len; i++) {
            if(s.charAt(i-1) != s.charAt(i)) {
                isAllSame = false;
                break;
            }
        }
        for(int i=1; i<len; i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                cPerS++;
                i++;
            }
        }
        int cPerS2 = 0;
        for(int i=1; i<len*2; i++) {
            if(s2.charAt(i-1) == s2.charAt(i)) {
                cPerS2++;
                i++;
            }
        }
        long result = (cPerS * k) + ((cPerS2 - cPerS - cPerS) * (k-1));
        if(isAllSame) {
            result = len * k / 2;
        }
        System.out.println(result);
    }
}
