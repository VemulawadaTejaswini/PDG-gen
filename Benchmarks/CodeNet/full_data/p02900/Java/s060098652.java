import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        sc.close();

        BigInteger C = A.gcd(B);
        int cnt = 1;

        long D = C.longValue();
        while (true) {
            if (D%2==0) {
                cnt++;
                D /= 2;
            } else {
                break;
            }
        }
        long i = 3;
        while (D>=i) {
            if (D%i==0) {
                cnt++;
                D /= i;
            } else {
                i += 2;
            }
        }
        System.out.println(cnt);
    }
}