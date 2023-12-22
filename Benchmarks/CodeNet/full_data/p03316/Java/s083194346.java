import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int digits = String.valueOf(n).length();

		int sum = 0;

		List<Integer> list = new ArrayList<>();
		while (n > 0) {
		    sum += n % 10;
		    n /= 10;
		}

		if(n % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
