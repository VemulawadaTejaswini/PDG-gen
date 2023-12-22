import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long n = stdIn.nextLong();
		
		long max = 1;
		
		for(long i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				max = i;
			}
			
		}
		
		long katahou = n / max;
		
		long ans = max + katahou - 2;
		
		System.out.println(ans);
		
		
		
	}

}
