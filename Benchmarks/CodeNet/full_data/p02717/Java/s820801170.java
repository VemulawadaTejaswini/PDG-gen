import java.util.*;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long K = in.nextLong();
		System.out.println(absolutediff(N,K));
	}
	
	public static long absolutediff(long N, long K) {
		if(N < K) {
			return Math.min(Math.abs(N-K),Math.abs(Math.abs(N-K)-K));
		}
		else {
			return absolutediff(N%K, K);
		}
	}
	
}
