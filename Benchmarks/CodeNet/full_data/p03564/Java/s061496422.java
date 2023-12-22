import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int min = 1;

		for (int i = 0; i < n; i++) {
			min = Math.min(min * 2, min + k);
		}

		System.out.println(min);

		sc.close();

	}

}
