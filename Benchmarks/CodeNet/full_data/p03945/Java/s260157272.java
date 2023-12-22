import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        System.out.println( solve(S) );
    }

    private static int solve(String S) {
        char first = S.charAt(0);
        boolean black = first == 'B';
        int ans = 0;
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);

            if( black && c == 'W' ) {
                ans++;
                black = false;
            } else if( !black && c == 'B' ){
                ans++;
                black = true;
            }
        }
        return ans;
    }
}