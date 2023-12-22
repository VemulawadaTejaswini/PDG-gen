import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> prime = new TreeSet<>();
		prime.add(2);
		prime.add(3);
		for(int i = 5; i <= 100003; i+=2) {
			boolean isprime = true;
			for(int j = 2; j*j <= i; j++) {
				if(i % j == 0) {
					isprime = false;
					break;
				}
			}
			if(isprime)
				prime.add(i);
		}
		System.out.println(prime.higher(sc.nextInt()-1));

	}

}