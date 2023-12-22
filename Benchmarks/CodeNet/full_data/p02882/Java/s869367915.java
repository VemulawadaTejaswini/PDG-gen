import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     BigDecimal a= BigDecimal.valueOf(Long.valueOf(chars[0]));
	     BigDecimal b= BigDecimal.valueOf(Long.valueOf(chars[1]));
	     BigDecimal x= BigDecimal.valueOf(Long.valueOf(chars[2]));

	     BigDecimal value = a.multiply(a.multiply(b));
	     if(value.compareTo(x.multiply(new BigDecimal("2.00")))>0) {
	    	 BigDecimal tri = x.divide(a,12, BigDecimal.ROUND_HALF_UP);
	    	 BigDecimal tan = tri.multiply(new BigDecimal("2.00")).divide(b ,12, BigDecimal.ROUND_HALF_UP).divide(b ,12, BigDecimal.ROUND_HALF_UP);
	    	 System.out.println(90-Math.atan(tan.doubleValue())*180/Math.PI);
	     }
	     else {
	    	 BigDecimal tri = ((a.multiply(a.multiply(b))).subtract(x)).divide(a,12, BigDecimal.ROUND_HALF_UP);
	    	 BigDecimal tan = tri.multiply(new BigDecimal("2.00")).divide(a ,12, BigDecimal.ROUND_HALF_UP).divide(a ,12, BigDecimal.ROUND_HALF_UP);
	    	 System.out.println(Math.atan(tan.doubleValue())*180/Math.PI);
	     }
	}

}
