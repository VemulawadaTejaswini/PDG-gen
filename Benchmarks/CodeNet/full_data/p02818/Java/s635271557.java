import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b  = sc.nextLong();
		long k  = sc.nextLong();
		long takahashi = a;
		long aoki = b;
		
		if(a <= k) {
			takahashi = 0;
		}else {
			takahashi = a - k;
		}
		
		if(0 < k - a) {
			aoki = Math.max(0, b - (k - a));
		}
		
		System.out.println(takahashi + " " + aoki);
		sc.close();
	}
	
}