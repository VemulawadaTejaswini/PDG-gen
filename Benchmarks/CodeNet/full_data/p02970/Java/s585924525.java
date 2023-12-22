import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int tree = 0;
		int number = 0;
		for (int i=1; i<=n; i++) {
			if (i-d < 1) {
				continue;
			} else if (i-d == 1) {
				tree = i+d;
				number++;
				continue;
			} else {
				if (tree <= n) {
					tree = tree+i+d;
					number++;
					continue;
				}
			}
		}

		System.out.println(number);
		sc.close();
	}
}
