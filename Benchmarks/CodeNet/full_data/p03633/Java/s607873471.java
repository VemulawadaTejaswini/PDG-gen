import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] t = new long[n];
		for(int i=0;i<n;i++) {
			t[i] = in.nextLong();
		}
		Arrays.sort(t);
		long ans = t[n-1];
		for(int i=n-2;i>=0;i--) {
			long g = gcd(ans,t[i]);
			ans = ans/g*t[i];
		}
		System.out.println(ans);
		in.close();
	}
	
	public static long gcd(long a,long b) {
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}

}
