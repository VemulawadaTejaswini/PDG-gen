import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        sc.close();

        for (int i=(int)Math.sqrt(N.doubleValue()); i>0; i--) {
            BigInteger d[] = N.divideAndRemainder(new BigInteger(Integer.toString(i)));
            if (d[1].compareTo(BigInteger.ZERO)==0) {
                System.out.println(d[0].add(N.divide(d[0])).subtract(new BigInteger("2")));
                break;
            }
        }
    }
}