import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long repCount = n / (a+b);
			
			long residual = n % (a+b);
			
			long ans = repCount * a;
			
			if ( a <= residual ) {
				ans += a;
			}
			else {
				ans += residual;
			}
			
			System.out.println(ans);
		}
	}
}