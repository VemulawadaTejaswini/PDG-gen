import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		a = a - a % 1000;
		if (a == 0) {
			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
	}
}
