import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static long gcd(long A, long B) {
		long n = A % B;
		if(n == 0) {
			return(B);
		}
		return gcd(B, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Long> divisor = new TreeSet<>();
		long A = sc.nextInt();
		long B = sc.nextInt();
		long n = 0;
		if(A < B) {
			n = gcd(A, B);
		}else {
			n = gcd(B, A);
		}
		divisor.add(n);

		if(n % 2 == 0) {
			divisor.add((long)2	);
		}

		for(long i = 1; i <= n / 2; i += 2) {
			if(n % i == 0) {
				divisor.add(i);
			}
		}

		long result = 1;

		Long[] divisor2 = new Long[divisor.size()];
		divisor.toArray(divisor2);

		for(long i = 0; i < divisor.size() - 1; i++) {
			if(gcd(divisor2[(int)i + 1], divisor2[(int)i]) == 1) {
				result++;
			}
		}

		System.out.println(result);

		sc.close();
	}
}
