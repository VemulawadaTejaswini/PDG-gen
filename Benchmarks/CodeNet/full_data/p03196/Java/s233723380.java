
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		
		if(n == 1) {
			System.out.println(k);
		}
		else {
			int []a = fac(k);
			long p = 1;
			for(int i = 2 ; i <= Math.sqrt(k) ;i++) {
				if(a[i] >= n) {
					p *= (long)Math.pow(i, a[i]/n);
				}
			}
			
			System.out.println(p);
			
			
		}
		
	}
	
	public static int[] fac(long k) {
		int []a = new int [(int)(Math.sqrt(k)+1)];
		
		long tmp = k;
		for(int i = 2 ; (long)i*i <= k ;i++) {
			int cnt = 0;			
				while(tmp % i == 0) {
					tmp /= i;
					cnt++;
				}
				a[i] = cnt;
		}
		return a;
	}

}
