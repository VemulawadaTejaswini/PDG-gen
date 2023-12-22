import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long tmp = 100;
        int tmp2 = 100;
        if(n-k<=0) {
            System.out.println(n);
            return;
        } else {
            if(k==1L) {out.println(0);
            return ;}
        }
        tmp = n-k;
        while(true) {
            if(tmp<(Math.abs(tmp-k))) break;

            if(tmp > Math.abs(tmp-k)) {
                tmp = Math.abs(tmp-k);
                //tmp2 = tmp;
            }
        }
        System.out.println(tmp);

    }
}