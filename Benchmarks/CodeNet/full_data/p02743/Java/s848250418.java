import java.util.*;
import java.math.*;
public class Main {
     public static BigDecimal standardDeviation(BigDecimal variance, int scale) {
         variance.setScale(scale, BigDecimal.ROUND_HALF_UP);
        //方差
        BigDecimal base2 = BigDecimal.valueOf(2.0);
        //计算精度
        int precision = 500;
        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal deviation = variance;
        int cnt = 0;
        while (cnt < 500) {
            deviation = (deviation.add(variance.divide(deviation, mc))).divide(base2, mc);
            cnt++;
        }
        deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return deviation;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            BigDecimal a = sc.nextBigDecimal();

            BigDecimal b = sc.nextBigDecimal();

            BigDecimal c = sc.nextBigDecimal();
            if ((standardDeviation(a, 500).add(standardDeviation(b, 500))).compareTo(standardDeviation(c, 500)) < 0)
                System.out.println("Yes");
            else
                System.out.println("No");

            /*BigDecimal ans = BigDecimal.valueOf(1.0);
            BigDecimal e = BigDecimal.valueOf(1.0);
            //ans.pow(n);
            int s = 10000;
            for(int i=0; i< 110; i++)		ans = ans.multiply(c).setScale(s,BigDecimal.ROUND_HALF_DOWN);
            System.out.println(ans.stripTrailingZeros().toPlainString());
            ans = e.subtract(ans);
            System.out.println(ans.stripTrailingZeros().toPlainString());
            c = e;
            for (int i = 0; i < 500; i ++) c = c.multiply(ans).setScale(s,BigDecimal.ROUND_HALF_DOWN);
            ans = c;
            System.out.println(ans.stripTrailingZeros().toPlainString());
            for (int i = 1; i < 500; i ++) c = c.multiply(ans).setScale(s,BigDecimal.ROUND_HALF_DOWN);
            ans = c;
            System.out.println(ans.stripTrailingZeros().toPlainString());
            for (int i = 1; i < 500; i ++) c = c.multiply(ans).setScale(s,BigDecimal.ROUND_HALF_DOWN);
            ans = c;
            System.out.println(ans.stripTrailingZeros().toPlainString() );
             */
        }
    }
}
