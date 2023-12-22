import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] s = new int[n];
		long d = 0;
		for(int i = 0;i < n;i ++) {
			s[i] = in.nextInt();
			s[i] -= i + 1;
			d += s[i];
		}
		long e = (long)(d * 1.0 / n + 0.5);
		d = 0;
		for(int i = 0;i < n;i ++) {
			d += Math.abs(s[i] - e);
		}
		System.out.println(d);
	}
}
