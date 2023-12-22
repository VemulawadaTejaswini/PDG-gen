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
		
		long ns = n-s;
		for(long i=2; i*i<=n || ns/(i-1)+i>=s; i++)
			if(f(n, i)==s)
				return i;
		long max=1;
		while(ns/max+max>=s)
			max++;
		for(; max>=1; max--)
			if(f(n, ns/max+1)==s)
				return ns/max+1;
		
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
