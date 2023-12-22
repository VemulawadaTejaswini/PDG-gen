import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long T = sc.nextLong();
		
		long start = sc.nextLong();
		long[] ruiseki = new long[N-1];
		for (int i = 1; i < N; i++) {
			long ti = sc.nextLong();
			ruiseki[i-1] = ti - start;
			
			start = ti;
		}
		
		long ans = T;
		for (int i = 0; i < ruiseki.length; i++) {
			ans += Math.min(T, ruiseki[i]);
		}
		
		System.out.println(ans);
	}
}
