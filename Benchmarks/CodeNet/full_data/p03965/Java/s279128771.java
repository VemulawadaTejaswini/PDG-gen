import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println( solve(S) );
    }

    private static int solve(String S) {
        int p_at = S.length() / 2;
        int p_top = 0;
        for (int i = 0; i < S.length(); i++) {
            if( S.charAt(i) == 'p' ) {
                p_top++;
            }
        }
        return p_at - p_top;
    }
}