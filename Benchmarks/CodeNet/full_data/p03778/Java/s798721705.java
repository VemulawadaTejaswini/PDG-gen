
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = Math.max(b - (a + W), a  - (b + W));

        System.out.println(ans < 0 ? 0 : ans);


    } // mainMethod


} // MainClass
