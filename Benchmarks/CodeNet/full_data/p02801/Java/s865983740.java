import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * A - Next Alphabet
 * z でない英小文字 C が与えられます。アルファベット順で C の次の文字を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力されたアルファベット
        String c = sc.next();

        List<String> alphabetList = Arrays.asList( "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" );

        int cIndex = alphabetList.indexOf( c );
        System.out.println( alphabetList.get( cIndex + 1 ) );

        sc.close();
    }
}