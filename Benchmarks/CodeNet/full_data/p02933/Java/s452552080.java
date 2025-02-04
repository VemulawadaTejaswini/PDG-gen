import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextLong();
		}
		long num = lcm(a,n);
		//System.out.println(l);
		long deno = sum(a,n,num);
		//System.out.println(deno);
		double ans = (double)num / deno;
		System.out.println(ans);
	
	}
	
	public static long gcd(long a, long b){
		if(a == 0){
			return b;
		}
		if(b == 0){
			return a;
		}
		if(a > b){
			return gcd(a-b,b);
		}
		return gcd(a,b-a);
	}
	
	public static long lcm(long[] a, int n){
		long lc = 1;
		for(int i = 0; i < n; i++){
			if(lc % a[i] == 0)
				i += 1;
			lc =  (lc * a[i])/gcd(lc,a[i]);
		}
		return lc;
	}
	
	public static long sum(long[] a,int n,long num){
		long count = 0;
		for(int i = 0; i < n; i++){
			count += (num/a[i]);
		}
		return count;
	}
	
	
	
	}
