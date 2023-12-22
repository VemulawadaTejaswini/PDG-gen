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
		double tan = (a*b*b)/(2*x);
		System.out.println(Math.toDegrees(Math.atan(tan)));
	}	
}