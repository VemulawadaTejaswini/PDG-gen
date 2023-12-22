import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			

			int k= sc.nextInt();
			
			int sum = 0;
			
			for(int a = 1 ; a <= k ; a++) {
				for(int b = 1 ; b <= k ; b++ ) {
					for(int c = 1 ; c <= k ; c++ ) {
						
						int gcd1 = gcd(a, b);
						int gcd2 = gcd(gcd1, c);
						
						sum+= gcd2;
					}
				}
			}
			
			System.out.println(sum);
		}
	}
	
	public static int gcd(int a, int b) {

		if ( a < b ) {
			return gcd(b, a);
		}
		
		if ( a % b == 0 ) {
			return b;
		}
		else {
			return gcd(a % b, b);
		}
	}

}