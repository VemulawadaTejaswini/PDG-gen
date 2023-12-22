import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();

		List<String> rates = Arrays.asList(line1.split(","));

		System.out.println(rates.get(0) + " " + rates.get(1) + " " + rates.get(2));

	}

}