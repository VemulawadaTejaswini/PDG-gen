import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (isKaibun(S) && isKaibun(S.substring(0, S.length()/2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isKaibun(String s) {
        boolean result = true;
        int len = s.length();
        for (int i=0; i<=len/2; i++) {
            if (s.charAt(i) != s.charAt(len-1-i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}