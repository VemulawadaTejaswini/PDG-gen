import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        BigDecimal c = new BigDecimal(sc.next());
        
        System.out.println(
            a.sqrt(MathContext.DECIMAL128).add(
                b.sqrt(MathContext.DECIMAL128)
            ).compareTo(c.sqrt(MathContext.DECIMAL128))
            <1?"Yes":"No"
        );
    }
 
}