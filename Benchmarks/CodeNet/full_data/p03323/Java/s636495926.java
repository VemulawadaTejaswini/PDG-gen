

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		
		if (a <= 8 && b <= 8) {
			System.out.println("Yey!");
		}else {
			System.out.println(":(");
		}
		
		
	}

}
