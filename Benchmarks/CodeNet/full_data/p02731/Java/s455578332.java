import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		double a  = l/3;
		l = l-(int) a;
		double b = l/3;
		double c = (l-(int)b);
		System.out.print(a*b*c);
	}
}