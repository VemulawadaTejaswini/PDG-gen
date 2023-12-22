import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		int a[];
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		if (n == 1) {
			if (a[0] == 0) {
				System.out.println(1 + "\n");
			} else {
				System.out.println(0 + "\n");
			}
			scanner.close();
			return;
		}

		int c = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = a[i];
			for (int j = i + 1; j < n; j++) {
				sum = sum + a[j];
				if (sum == 0) {
					c++;
				}
			}
		}

		System.out.println(c + "\n");
		scanner.close();
	}
}