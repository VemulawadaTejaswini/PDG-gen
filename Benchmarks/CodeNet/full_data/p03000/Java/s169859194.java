
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int sum = 0;
			int count = 1;
			for (int i = 0; i < n; i++) {
				int l = sc.nextInt();
				sum += l;
				if (x < sum) {
					System.out.println(count);
					return;
				}
				count++;
			}
		}
	}
}
