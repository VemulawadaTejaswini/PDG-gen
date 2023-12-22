import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		
		boolean isPrime;
		for (int i = 8; i < 100000;i++) {
			isPrime = true;
			for(Integer p:primes) {
				if(i%p == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) primes.add(i);
		}
		
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		
		for (int i = 0; i < q; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int counter = 0;
			
			for (int j = a; j <= b; j+=2) {
				if(primes.contains(j) && primes.contains((j+1)/2)) counter++;
			}
			
			System.out.println(counter);
		}
		scan.close();
		
	}

}
