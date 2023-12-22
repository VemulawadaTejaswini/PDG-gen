import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();

        BigInteger aB = BigInteger.valueOf(a);
        BigInteger bB = BigInteger.valueOf(b);
        BigInteger cB = BigInteger.valueOf(c);

        BigInteger t = cB.subtract(aB).subtract(bB);

        BigInteger left = t.multiply(t);

        BigInteger four = BigInteger.valueOf(4);

        BigInteger right = four.multiply(aB).multiply(bB);

        if(left.compareTo(right) == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}