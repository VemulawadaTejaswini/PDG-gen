import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();

        BigInteger BigA = BigInteger.valueOf(a);
        BigInteger BigB = BigInteger.valueOf(b);

        BigInteger Big25 = BigInteger.valueOf(25);
        BigInteger Big2 = BigInteger.valueOf(2);
        BigInteger Big1 = BigInteger.valueOf(1);
        BigInteger Big10 = BigInteger.valueOf(10);

        BigInteger l1 = Big25.multiply(BigA).divide(Big2);
        BigInteger r1 = Big25.multiply((BigA.add(Big1))).divide(Big2);
        BigInteger l2 = Big10.multiply(BigB);
        BigInteger r2 = Big10.multiply((BigB.add(Big1)));

        if(r1.compareTo(l2) == -1 || r2.compareTo(l1) == -1){
            System.out.println(-1);
        }else{
            System.out.println(l1.compareTo(l2) == -1 ? l2 : l1);
        }
    }
}