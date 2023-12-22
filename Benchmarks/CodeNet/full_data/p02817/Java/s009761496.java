import java.util.Scanner;

/**
 * A - Strings
 * 英小文字のみからなる 2 つの文字列 S, T が与えられます。
 * これらの文字列を T, S の順に空白を空けずに連結し、できる文字列を出力してください。
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        String s = sc.next();   // 文字列S
        String t = sc.next();   // 文字列T

        System.out.println( t.concat( s ) );

        sc.close();
    }
}