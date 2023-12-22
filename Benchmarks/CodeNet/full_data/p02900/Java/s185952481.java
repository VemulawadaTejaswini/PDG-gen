import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        sc.close();

        BigInteger C = A.gcd(B);
        boolean f = true;
        long cnt = 1;

        long D = C.longValue();
        while (true) {
            if (D%2==0) {
                D /= 2;
                if (f)
                    cnt++;
                f = false;
            } else {
                break;
            }
        }
        long i = 3;
        f = true;
        while (D>=i) {
            if (D%i==0) {
                D /= i;
                if (f)
                    cnt++;
                f = false;
            } else {
                i += 2;
                f = true;
            }
        }
        System.out.println(cnt);
    }
}