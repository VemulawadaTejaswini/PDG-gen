import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s = sc.nextLong();
		System.out.println(solve(n, s));
		sc.close();
	}
	
	static long solve(long n, long s) {
		if(n<s)
			return -1;
		if(n==s)
			return n+1;
		for(long i=2; i*i<=n; i++)
			if(f(n,i)==s)
				return i;
		long ns = n-s;
		for(long i=2; i*i<=ns; i++)
			if(f(n,ns/i+1)==s)
				return ns/i+1;
		
		
		return -1;
	}
	
	static long f(long n, long b) {
		long ans = 0;
		while(n>0) {
			ans += n%b;
			n/=b;
		}
		return ans;
	}
}
