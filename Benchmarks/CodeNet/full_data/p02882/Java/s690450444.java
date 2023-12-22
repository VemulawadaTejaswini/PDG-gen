import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double x = sc.nextInt();
		if(2*(b-x/(a*a))>=b) {
			double m = 2*x/(a*b);
			double tan = b/m;
			System.out.println(Math.toDegrees(Math.atan(tan)));
		}
		else {
			double m = 2*(b-x/(a*a));
			double x_2 = a*a*m/2;
			double tan = a/m;
			System.out.println(90-Math.toDegrees(Math.atan(tan)));
		}
	}	
}