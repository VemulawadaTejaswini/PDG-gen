
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = 1;

			int result = 0;
			while(tmp < b) {
				tmp += a - 1;
				result++;
			}

			System.out.println(result);
		}
	}
}
