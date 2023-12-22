import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println( solve(S) );
    }

    private static String solve(String S) {
        char prev2 = S.charAt(0);
        char prev1 = S.charAt(1);
        if( prev2 == prev1 ) return "1 2";

        for (int i = 2; i < S.length(); i++) {
            char c = S.charAt(i);
            if( prev2 == c ) {
                return (i-1) + " " + (i+1);
            } else if( prev1 == c ) {
                return i + " " + (i+1);
            } else {
                prev2 = prev1;
                prev1 = c;
            }
        }
        return "-1 -1";
    }
}