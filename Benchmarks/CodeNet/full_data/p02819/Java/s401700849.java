
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long X_2 = X * X;
		int p;
		ArrayList<Long> primeNumbers = new ArrayList<Long>();

		primeNumbers.add((long) 2);
		if (X == 2) {
			System.out.println(2);
		} else {
			for (long i = 3; i < X_2; i++) {
				boolean flag = true;
				long limit = (long) Math.sqrt(i) + 1;
				for (int j = 0; primeNumbers.get(j) < limit; j++) {
					if (i % primeNumbers.get(j) == 0) {
						flag = false;
					}
				}
				if (flag) {
					if (i >= X) {
						primeNumbers.add(i);
						break;
					}
					primeNumbers.add(i);
				}
			}
			System.out.println(primeNumbers.get(primeNumbers.size()-1));
		}
	}

}
