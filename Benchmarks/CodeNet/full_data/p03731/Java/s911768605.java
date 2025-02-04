
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long t = scanner.nextInt();

        long ans = 0;
        long old = scanner.nextLong();
        for (int i = 0; i < n - 1; i++) {
            long temp = scanner.nextLong();
            ans += Math.min(temp - old, t);
            old = temp;
        }
        System.out.println(ans + t);


    } // mainMethod


} // MainClass
