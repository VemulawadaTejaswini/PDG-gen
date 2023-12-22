import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong(), B = scn.nextLong();

		long N = MyMath.gcd(A,B);
		int ans = 1;
		for(int i = 2;i <= Math.sqrt(N);i++) {
			if(N%i==0) {
				ans++;
				while(N%i==0) {
					N/=i;
				}
			}
		}
		if(N>1)ans++;
		System.out.println(ans);
	}
}
class MyMath{
	public static long gcd(long a,long b) {
		while(a%b!=0) {
			long buf = a%b;
			a = b;
			b = buf;
		}
		return b;
	}}

