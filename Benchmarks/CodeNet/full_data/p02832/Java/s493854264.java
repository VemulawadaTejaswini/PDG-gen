import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int current = 1;
		int broken = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == current) {
				current++;
			} else {
				broken++;
			}
		}

		if (current == 1) {
			System.out.println("-1");
		} else {
			System.out.println(broken);
		}

		sc.close();
	}

}
