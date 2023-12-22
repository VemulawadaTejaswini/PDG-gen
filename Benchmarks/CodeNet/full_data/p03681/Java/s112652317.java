import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        final long limit = (int)(Math.pow(10,9) + 7);
        BigInteger tmp;


        int sub = Math.abs(n -m);

        if(sub >= 2)
            tmp = BigInteger.ZERO;
        else if(n == m) {
            tmp = BigInteger.valueOf(2).multiply(kaijo(n)).multiply(kaijo(m)).remainder(BigInteger.valueOf(limit));
        }
        else {
            tmp = kaijo(n).multiply(kaijo(m)).remainder(BigInteger.valueOf(limit));
        }
        System.out.println(tmp);
    }
    public static BigInteger kaijo(int n)
    {
        BigInteger tmp = BigInteger.ONE;
        for(int i = 2;i <= n;i++)
            tmp = tmp.multiply(BigInteger.valueOf(i));
        return tmp;
    }
}
