import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BigDecimal a = new BigDecimal(scan.next());
		BigDecimal b = new BigDecimal(scan.next());
		BigDecimal c = new BigDecimal(scan.next());
		if(sqrt(a, 50).add(sqrt(b, 50)).compareTo(sqrt(c, 50)) == -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static BigDecimal sqrt(BigDecimal a, int scale){

        BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17){
             x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
             return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }
}
