import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner in = new Scanner(System.in);
        BigDecimal f = BigDecimal.valueOf(in.nextInt());
        BigDecimal k = BigDecimal.valueOf(in.nextInt());
        in.close();
        BigDecimal prob = BigDecimal.valueOf(0,10);
        BigDecimal tmp = BigDecimal.valueOf(0);
        BigDecimal c;
        boolean first = true;
        int min;
        tmp.setScale(0);
        int hold = f.intValue();
        for (int i = 0; i < 10; i++) {
            c = BigDecimal.valueOf(Math.pow(2, i));
            tmp = k.divide(c, RoundingMode.HALF_DOWN);
            min = k.divide(c, RoundingMode.UP).intValue();
            if (tmp.intValue() <= 0) break;
            if ( hold >= min && first) {
            	prob = prob = prob.add(BigDecimal.valueOf(hold - min + 1).divide(c, 10, RoundingMode.HALF_EVEN).divide(f, 10, RoundingMode.HALF_EVEN));
            	first = false;
            } else if (!first) {
            	prob = prob.add(tmp.divide(c, 10, RoundingMode.HALF_EVEN).divide(f, 10, RoundingMode.HALF_EVEN));
            }
        }
        System.out.println(prob.toPlainString());

    }
    
}