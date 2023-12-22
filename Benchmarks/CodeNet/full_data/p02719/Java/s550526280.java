import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		long n = Long.parseLong(tmp[0]);
		long k = Long.parseLong(tmp[1]);



		if(n % k == 0) {

			System.out.println(0);
			return;


		}

		while(n > 0) {

			long diff = Math.abs(n - k);

			n = Math.min(n, diff);

			if(n != diff)break;

		}

		System.out.println(n);

	}
}