package rounduptheman;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		double ab = a+b;
		int ans = (int)Math.ceil(ab/2);
		
		System.out.println(ans);
		
		scanner.close();
	}

}
