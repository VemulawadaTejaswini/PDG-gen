import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a =sc.nextLong();
		long b=sc.nextLong();
		long k=gcd(a,b);
		int ans=1;
		for(int i=2; i<=k; i++){
			if(k%i==0){
				while(k%i==0){
					k/=i;
				}
				ans++;
			}
		}
		System.out.println(ans);
	}
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
	}
}
