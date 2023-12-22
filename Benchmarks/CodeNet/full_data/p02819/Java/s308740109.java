import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long a = Long.parseLong(scanner.nextLine());


		if(isPrime(a)) {

			System.out.println(a);
			return;

		}

		if(a % 2 == 0) {

			a++;

		}




		for(;;) {

			if(isPrime(a)) {

				System.out.println(a);
				return;
			}

			a += 2;

		}
	}
	private static boolean isPrime(long num) {
		if(num < 2)  return false;
		if(num == 2) return true ;
		if(num % 2 == 0) return false;

		for(int i = 3; i < Math.sqrt(num); i++) {
			//素数？素数じゃない？
			if(num % i == 0) {return false;}

		}

		return true;
	}
}