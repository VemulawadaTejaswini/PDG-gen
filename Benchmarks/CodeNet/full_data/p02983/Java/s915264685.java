import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		long L = scanner.nextLong();
		long R = scanner.nextLong();
		System.out.println(calc(L,R));
		
		scanner.close();
	}
	
	public static long calc(long L , long R) {
		if(L > 2019) {
			return (L%2019) * ((L+1)%2019);
		}
		if(R - L == 1) {
			return (L%2019) * (R%2019);
		}
		if(R < 2019) {
			return 0;
		}
		if(L/2019 != R/2019) {
			return 0;
		}
		return 0;
	}
}
