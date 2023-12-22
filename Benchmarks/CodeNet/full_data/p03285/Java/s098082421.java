import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int count = 0;
		n = sc.nextInt();

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (n == i * 4 + j * 7) {
					System.out.println("Yes");
					count = 1;
					break;
				}
			}
			if (count == 1) {
				break;
			}
		}
		if (count != 1) {
			System.out.println("No");
		}
		sc.close();
	}

}
