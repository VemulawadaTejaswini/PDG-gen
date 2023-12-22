
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int result = 0;
        int prevSize = S.length();
        while(true) {
            S = S.replaceFirst("01|10", "");
            if(prevSize == S.length()) break;
            prevSize = S.length();
            result += 2;
        }
        System.out.println(result);

    }

}