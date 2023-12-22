import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println( solve(S) );
    }

    private static String solve(String S) {
        if( S.length() == 26 ) {
            return solve26(S);
        } else {
            return solve25(S);
        }
    }

    private static String solve26(String S) {
        for (int i = S.length() - 1; i >= 0; i--) {
            Set<Character> used = usedChars(S, i);
            for (char c = (char)(S.charAt(i) + 1); c <= 'z' ; c++) {
                if( !used.contains(c) ) {
                    return S.substring(0, i) + c;
                }
            }
        }
        return "-1";
    }

    private static Set<Character> usedChars(String S, int to) {
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < to; i++) {
            used.add( S.charAt(i) );
        }
        return used;
    }

    private static String solve25(String S) {
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            used.add( S.charAt(i) );
        }

        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);

            if( !used.contains(c) ) {
                return S + c;
            }
        }

        throw new RuntimeException("wtf");
    }
}