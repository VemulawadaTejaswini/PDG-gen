import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int p = x;
		while(!isPrime(p)) {
			p++;
		}
		System.out.println(p);
	}
	
	static boolean isPrime(int x) {
		if(x <= 1) {
			return false;
		}
		for(int i = 2; i * i <= x; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;		
	}
}