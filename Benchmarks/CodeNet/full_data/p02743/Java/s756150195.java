package panasonic;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();
        BigDecimal c = sc.nextBigDecimal();
        BigDecimal aa = sqrt(a, 50);
        BigDecimal bb = sqrt(b, 50);
        BigDecimal cc = sqrt(c, 50);
        if (aa.add(bb).compareTo(cc) == -1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static BigDecimal sqrt(BigDecimal a, int scale){
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;
        BigDecimal b2 = new BigDecimal(2);
        for (int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                            x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }
}