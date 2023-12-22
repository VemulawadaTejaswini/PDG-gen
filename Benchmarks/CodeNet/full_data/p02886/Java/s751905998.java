import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int list[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				sum += list[i] * list[j];
			}
		}

		System.out.println(sum);

		sc.close();

	}
}
