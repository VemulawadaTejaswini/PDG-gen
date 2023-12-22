import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println( solve(s) );
    }

    private static String solve(String s) {
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);

        if( first == last ) {
            // aba
            if( s.length() % 2 == 0 ) {
                return "First";
            } else {
                return "Second";
            }
        } else {
            // abab
            if( s.length() % 2 == 1 ) {
                return "First";
            } else {
                return "Second";
            }
        }
    }
}