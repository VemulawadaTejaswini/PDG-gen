import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //x=0; y=1
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		long ans = 0;
		if (Same(x,y)) {
			if (x>y) {
				ans = Math.abs(x-y)+2;
				if (y==0) ans--;
			} 
			else ans = Math.abs(x-y);
		}else {
			ans = Math.abs(Math.abs(x)-Math.abs(y))+1;
			if (x==0) ans--;
		}
		System.out.println(ans);
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
