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
		double ans = num / (double)deno;
		System.out.println(ans);
	
	}
	
	public static long gcd(long a, long b){
		if(a == 0)
			return b;
		
		return gcd(b%a,a);
	}
	
	public static long lcm(long[] a, long n){
		long lc = 1;
		for(int i = 0; i < n; i++){
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