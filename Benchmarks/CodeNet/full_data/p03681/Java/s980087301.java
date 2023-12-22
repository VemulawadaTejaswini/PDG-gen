import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        final long limit = (int)(Math.pow(10,9) + 7);
        BigDecimal tmp;


        int sub = Math.abs(n -m);

        if(sub >= 2)
            tmp = BigDecimal.ZERO;
        else if(n == m) {
            tmp = BigDecimal.valueOf(2).multiply(kaijo(n)).multiply(kaijo(m)).remainder(BigDecimal.valueOf(limit));
        }
        else {
            tmp = kaijo(n).multiply(kaijo(m)).remainder(BigDecimal.valueOf(limit));
        }
        System.out.println(tmp);
    }
    public static BigDecimal kaijo(int n)
    {
        BigDecimal tmp = BigDecimal.ONE;
        for(int i = 2;i <= n;i++)
            tmp = tmp.multiply(BigDecimal.valueOf(i));
        return tmp;
    }
}
