import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int max = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if (max >= x) {
				count++;
			} else {
				max = x;
			}
		}
		sc.close();
		System.out.println(count);

	}
}
