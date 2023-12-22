import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		long n = sc.nextLong();
		
		
		BigInteger ans = BigInteger.ZERO;
		
		for(long i = 1; i*i < n; i++) {
			if(n % i ==0) {
				long t = n / i - 1;
				if(n%t !=0 ) {
					ans = ans.add(BigInteger.valueOf(t));
				}
			}
		}		
		
		System.out.println(ans.toString());
	}
}
