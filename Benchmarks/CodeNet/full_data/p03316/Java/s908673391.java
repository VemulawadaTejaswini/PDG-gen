
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int target = n;
		int sum = 0;
		while (target > 0) {
			sum += target % 10;
			target /= 10;
		}
		System.out.println(n % sum == 0 ? "Yes" : "No");
		sc.close();
	}
}