import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
 
		if ((a * b * 1 % 2) != 0 || (a * b * 2 % 2) != 0 || (a * b * 3 % 2) != 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}
}