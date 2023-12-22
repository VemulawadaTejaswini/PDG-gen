import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        //入力
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    double a = Math.sqrt(sc.nextDouble());
    double b = Math.sqrt(sc.nextDouble());
    double c = Math.sqrt(sc.nextDouble());
    BigDecimal bda = new BigDecimal(a);
    BigDecimal bdb = new BigDecimal(b);
    BigDecimal bdc = new BigDecimal(c);


    	if( bda.add(bdb).compareTo(bdc) < 0) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }
}