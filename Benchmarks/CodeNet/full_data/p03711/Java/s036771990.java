import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x == 2) {
			if (y == 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else if (x == 4 || x == 6 || x == 9 || x == 11) {
			if (x == 4 || x == 6 || x == 9 || x == 11) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		sc.close();
	}
}
