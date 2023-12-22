import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long seconds = sc.nextLong();
		
		for(int i = 2; i<=N; i++) {
			long n = sc.nextLong();
			seconds = n/gcd(seconds, n)*seconds;
		}
		
		System.out.println(seconds);
	}
	
	public static long gcd(long x, long y) {
		if(y == 0) return x;
		return gcd(y, x%y);
	}

}
