//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		long sum = 0;
		for(int a=1;a<K+1;a++) {
			for(int b=1;b<K+1;b++) {
				for(int c=1;c<K+1;c++) {
					sum += gcd(gcd(a,b),c);
				}
			}
		}
		System.out.println(sum);
	
	}
	private static long gcd(long m,long n) {
		if(m<n) return gcd(n,m);
		if(n==0) return m;
		return gcd(n,m%n);
	}
	
}