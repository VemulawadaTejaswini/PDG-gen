import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		long l=lcm(c,d);
		System.out.println(b-b/c-b/d+b/l-a+1+(a-1)/c+(a-1)/d-(a-1)/l);
	}

	private static long lcm(long m,long n){
		return m*n/gcd(m,n);
	}

	private static long gcd(long m,long n){
		if(m<n)return gcd(n,m);
		if(n==0) return m;
		return gcd(n,m%n);
	}
}