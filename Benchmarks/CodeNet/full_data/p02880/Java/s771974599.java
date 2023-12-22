import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        sc.close();

        boolean b = false;
        for (int i=1; i<10; i++) {
            BigInteger d[] = N.divideAndRemainder(new BigInteger(Integer.toString(i)));
            if (d[1].compareTo(BigInteger.ZERO)==0 && d[0].compareTo(BigInteger.TEN)==-1) {
                b =true;
                break;
            }
        }

        if (b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}