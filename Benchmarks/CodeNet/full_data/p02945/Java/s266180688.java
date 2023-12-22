import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(getMax(a, b));
	}

	private static int getMax(int a, int b) {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(a + b);
		integers.add(a - b);
		integers.add(a * b);
		return Collections.max(integers);
	}

}