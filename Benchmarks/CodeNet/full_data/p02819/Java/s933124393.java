import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 100003;
		boolean[] isNotPrime = new boolean[max + 1];
		for (int i = 2; i * i <= max; i++) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
					isNotPrime[j] = true;
				}
			}

		}
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		while (isNotPrime[x]) {
			x++;
		}
		System.out.println(x);

	}

}
