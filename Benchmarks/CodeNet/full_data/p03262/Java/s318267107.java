import java.util.Arrays;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			long X = sc.nextLong();
			long[] x = new long[n];
			long[] y = new long[n-1];
			long ini = 0;
			
			
			for(int i=0;i<n;i++) {
				x[i] = sc.nextLong();
			}
			
			if(n==1) {
				System.out.println(x[0]-X);
				return;
			}
			
			Arrays.sort(x);
			
			for(int i=0;i<n-1;i++) {
				y[i]=x[i+1]-x[i];
				ini = Math.min(ini, Math.abs(X-x[i]));
			}
			
			ini = Math.min(ini, Math.abs(X-x[n-1]));
			long ret = gcd(ini,y[0]);
			
			
			for(int i=1;i<n-1;i++) {
				ret = gcd(ret,y[i]);
			}
			
			System.out.println(ret);
			
		}
		
		static long gcd (long a, long b) {
			long temp;
			while((temp = a%b)!=0) {
				a = b;
				b = temp;
			}
			return b;
		}
		
	}
