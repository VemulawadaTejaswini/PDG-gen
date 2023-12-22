import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);
	
	static String s;
	public static void main(String[] args) {
		s = sc.next();
		boolean[] plus = new boolean[s.length()-1];
		
		so.println(sum(plus, 0));
	}
	
	static long sum(boolean[] b, int lev) {
		if (lev == b.length)
			return parse(s, b);
		
		long sum = 0;
		b[lev] = false; // 12
		sum += sum(b, lev+1);
		
		b[lev] = true;  // 1+2
		sum += sum(b, lev+1);
		
		return sum;
	}

	static long parse(String s, boolean[] b) {
		if (s.length()-1 != b.length) throw new RuntimeException();
		
		StringBuilder ev = new StringBuilder();
		ev.append(s.charAt(0));
		
		for (int i = 0; i < b.length; i++) {
			if (b[i])
				ev.append("plus");
			ev.append(s.charAt(i+1));
		}
		
		String[] longs = ev.toString().split("plus");
		long ans = 0;
		for (int i = 0; i < longs.length; i++) {
			ans += Long.parseLong(longs[i]);
		}
		return ans;
	}
}
