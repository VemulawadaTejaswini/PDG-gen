import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		if (Same(x,y)) {
			if (x>y) System.out.println(Math.abs(x-y)+2);
			else System.out.println(Math.abs(x-y));
		}else System.out.println(Math.abs(Math.abs(x)-Math.abs(y))+1);
	}
	public static boolean Same(long a, long b) {
		if (a<=0&&b<=0) return true;
		if (a>=0&&b>=0) return true;
		return false;
	}
	/*Cases:
	 * 1. abs(y-x)
	 * 2. 
	 * 
	 * */
}