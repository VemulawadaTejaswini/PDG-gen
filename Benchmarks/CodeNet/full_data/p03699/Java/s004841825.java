import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];

		int sum = 0;
		boolean can = true;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
			if (s[i] % 10 != 0) can = false;
		}

		Arrays.sort(s);

		for (int i = 0; i < n; i++) {
			if (sum % 10 == 0 && s[i] % 10 != 0) {
				sum -= s[i];
				break;
			}
		}


		if (can) {
			System.out.println(0);
		} else {
			System.out.println(sum);
		}

		sc.close();

	}

}