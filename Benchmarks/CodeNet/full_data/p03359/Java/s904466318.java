import java.util.*;
import java.util.regex.*;
 
public class Main {
	
	public static void main(String[]  args) {
		System.out.println(countTakahashi(scanInt(), scanInt()));
	}
	
	private static int countTakahashi(int a, int b) {
		return a - ((b < a) ? 1 : 0);
	}
 
	
	private static final Scanner SC = new Scanner(System.in);
 
	private static int scanInt() {
		return SC.nextInt();
	}
 
	private static  String scanString() {
		return SC.next();
	}
}