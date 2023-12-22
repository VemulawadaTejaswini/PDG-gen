

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int a = scan.nextInt();

		int result;
		if (h % a == 0)
			result = h / a;
		else
			result = h / a + 1;
		System.out.println(result);
	}

}
