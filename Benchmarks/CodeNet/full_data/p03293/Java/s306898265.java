import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);

        String S = scanNumber.next();

        String T = scanNumber.next();

        scanNumber.close();

        char[] charS = S.toCharArray();
        char[] charSalfa = S.toCharArray();
        char[] charT = T.toCharArray();

        String answer = "No";

        char work = ' ';

        for(int i = 0; i < T.length() ; i++){
            work = charS[0];
            for(int j=0; j<T.length()-1 ; j++){
                charS[j] = charS[j + 1];
            }
            charS[T.length() -1] = work;
            if(Arrays.equals(charS, charT)){
                answer = "Yes";
                break;
            }

        }

        System.out.print(answer);

    }
}
