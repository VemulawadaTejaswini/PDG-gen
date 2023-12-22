import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal y = sc.nextBigDecimal();
        BigDecimal zero = BigDecimal.valueOf(0);

        if (x.compareTo(y) == 0) {
            System.out.println(-1);
        }else if (y.remainder(x) == zero) {
            System.out.println(-1);
        } else {
            BigDecimal tmp = x.multiply(y);
            tmp = tmp.add(x);
            System.out.println(tmp);
        }
    }
}