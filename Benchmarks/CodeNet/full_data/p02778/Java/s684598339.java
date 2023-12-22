
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            sb.append('x');
        }
        System.out.println(sb);
    }

}