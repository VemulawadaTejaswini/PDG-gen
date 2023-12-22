import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final int n  = sc.nextInt();
            final BigInteger p = new BigInteger(sc.next());
            final String s = sc.next();
            StringBuilder sb = new StringBuilder(s);

            int count = 0;
            for (int i=0; i<sb.length(); i++) {
                for (int j=i; j<sb.length(); j++) {
                    // System.out.println(sb.subSequence(i,  j+1));
                    BigInteger b = new BigInteger(sb.subSequence(i,  j+1).toString());
                    if (b.remainder(p).equals(BigInteger.ZERO)) {
                        count++;
                    }
                }
            }

            System.out.println(count);

        } finally {
            sc.close();
        }
    }
}
