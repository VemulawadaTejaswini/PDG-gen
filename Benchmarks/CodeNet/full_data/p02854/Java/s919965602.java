import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    BigInteger[] irons = new BigInteger[len];
    BigInteger sum = new BigInteger("0");
    for (int i = 0; i < irons.length; i++) {
      irons[i] = new BigInteger(sc.next());
      sum = sum.add(irons[i]);
    }

    BigInteger half = sum.divide(new BigInteger("2"));
    BigInteger cur = new BigInteger("0");
    for (int i = 0; i < irons.length; i++) {
      if (cur.add(irons[i]).compareTo(half) != 1) cur = cur.add(irons[i]);
      else {
        BigInteger out1 = sum.subtract(cur.multiply(new BigInteger("2")));
        //System.out.println(cur);
        cur = sum.subtract(cur.add(irons[i]));
        //System.out.println(cur);
        BigInteger out2 = sum.subtract(cur.multiply(new BigInteger("2")));
        System.out.println(out1.min(out2));
        return;
      }
    }
  }
}
