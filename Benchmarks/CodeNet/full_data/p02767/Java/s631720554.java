import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			sum = sum + x[i];
		}
		sc.close();

		int center = sum / n;
		if (sum % n > n / 2) {
			center++;
		}

		int answer = 0;

		for (int i = 0; i < n; i++) {
			answer = answer + (x[i] - center) * (x[i] - center);
		}

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
