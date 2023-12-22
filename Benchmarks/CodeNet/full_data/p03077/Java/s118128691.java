import java.util.*;

public class Main {

	static final int INF = Integer.MAX_VALUE/2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long min = Long.MAX_VALUE/2;
		for(int i=0;i<5;i++) {
			long t = sc.nextLong();
			min = Math.min(min, t);
		}
		sc.close();
		
		long ans = (n+min-1)/min;
		System.out.println(ans - 1 + 5);
	}
}