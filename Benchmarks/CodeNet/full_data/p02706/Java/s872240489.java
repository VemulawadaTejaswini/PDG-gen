import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();

		List<Long> list = new ArrayList<>();

		long sum = 0;

		while (sc.hasNext()) {
			sum += sc.nextLong();
		}

		long ret = n - sum;

		if (ret < 0) {
			System.out.println(-1);
		} else {
			System.out.println(ret);
		}
	}

}
