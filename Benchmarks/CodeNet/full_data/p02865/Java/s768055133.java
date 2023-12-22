import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		boolean check = true;
		for (int i = 1; i < n; i++) {
			for (int j = n; j > 0; j--) {
				if (i + j == n) {
					count++;
				}
			}
			if (i == n / 2) {
				break;
			}
		}
		System.out.println(count);
	}
}
