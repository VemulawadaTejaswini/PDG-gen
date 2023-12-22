import java.util.*;
import java.text.*;

public class Test{
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000000000");
		long H = sc.nextLong(), W = sc.nextLong(), x = sc.nextLong(), y = sc.nextLong();
		double half = H/2.0*W;
		if(H/2.0 == x && W/2.0 == y) {
			System.out.println(df.format(half) + " " + 1);
		}
		else {
			System.out.println(df.format(half) + " " + 0);
		}
	}
	
}