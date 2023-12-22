import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		BigDecimal a = BigDecimal.valueOf(in.nextLong());
		BigDecimal b = BigDecimal.valueOf(in.nextLong());
		BigDecimal c = BigDecimal.valueOf(in.nextLong());

		String answer =  sqrt(a).add(sqrt(b)).compareTo(sqrt(c)) == -1 ? "Yes" : "No";

		System.out.println(answer);
	}

    public static BigDecimal sqrt(BigDecimal a){
    	int scale = 50;
    	BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}