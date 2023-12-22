
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();


        if(a % 3 == 0 || b % 3 == 0){
            System.out.println(0);
            return;
        }

        long ans = 1999999999;
        for (long i = 1L; i <= a; i++) {
            long tempa = b * (a - i);
            long tempb = i * (b / 2);
            long tempc = a * b - tempa - tempb;
            long max = Math.max(tempa, Math.max(tempb, tempc));
            long min = Math.min(tempa, Math.min(tempb, tempc));
            ans = Math.min(ans, max - min);
        }
        for (int i = 1; i < a; i++) {
            long tempa = b * (a - i);
            long tempb = b * (a - i) / 2;
            long tempc = a * b - tempa - tempb;
            long max = Math.max(tempa, Math.max(tempb, tempc));
            long min = Math.min(tempa, Math.min(tempb, tempc));
            ans = Math.min(ans, max - min);
        }

        long temp = a;
        a = b;
        b = temp;
        for (long i = 1L; i <= a; i++) {
            long tempa = b * (a - i);
            long tempb = i * (b / 2);
            long tempc = a * b - tempa - tempb;
            long max = Math.max(tempa, Math.max(tempb, tempc));
            long min = Math.min(tempa, Math.min(tempb, tempc));
            ans = Math.min(ans, max - min);
        }
        for (int i = 1; i < a; i++) {
            long tempa = b * (a - i);
            long tempb = b * (a - i) / 2;
            long tempc = a * b - tempa - tempb;
            long max = Math.max(tempa, Math.max(tempb, tempc));
            long min = Math.min(tempa, Math.min(tempb, tempc));
            ans = Math.min(ans, max - min);
        }





        System.out.println(ans);


    } // mainMethod


} // MainClass
