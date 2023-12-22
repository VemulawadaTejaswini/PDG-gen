
import java.util.Scanner;

public class Main {

	public static long MOD = 998_244_353;
	public static void main (String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (sc.nextInt()!=0) {
			System.out.println(0);
			return;
		}
		long[]count = new long[n];
		count[0]=1;
		for (int i=1;i<n;i++) {
			int d =sc.nextInt();
			if (d==0 || d>=n) {
				System.out.println(0);
				return;
			} else {
				count[d]++;
			}
		}
		
		long ans = 1;
		for (int i=0;i<n-1;i++) {
			ans=ans*pow(count[i],count[i+1])%MOD;
			
		}
		System.out.println(ans);


	}
	static long pow(long a, long b) {
		if (b==0) {
			return 1;
		} else if (b%2==0) {
			long tmp = pow(a,b/2);
			return tmp*tmp%MOD;
		} else {
			long tmp = pow(a,b/2);
			return tmp*tmp%MOD*a%MOD;
		}
	}

}
