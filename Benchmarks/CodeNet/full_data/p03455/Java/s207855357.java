package product;

import java.util.*;

public class Main {

	public Main() {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a * b % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		scanner.close();
	}
}