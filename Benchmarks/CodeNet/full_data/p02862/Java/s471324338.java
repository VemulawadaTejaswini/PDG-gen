import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if((x+y)%3 != 0) {
            System.out.println(0);
            return;
        }
        // h段のパスカルの三角形の、
        int h = (x+y)/3 + 1;

        // 端（h-1回、ずっとx+2, y+1 で飛んだ座標）からn番目
        int n = 2*(h-1) - x + 1;

        // (h-1)C(n-1)
        BigInteger c = BigInteger.ONE;
        for(int i=0; i<n-1; i++) {
            c = c.multiply(new BigInteger(Integer.toString(h-1-i)));
        }
        for(int i=n-1; i>1; i--) {
            c = c.divide(new BigInteger(Integer.toString(i)));
        }
        c = c.mod(new BigInteger(Integer.toString(1000000007)));
        System.out.println(c.toString());
    }
}
