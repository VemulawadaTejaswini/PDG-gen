import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(c - (a - b) >= 0)
			System.out.println(c - (a - b));
		else
			System.out.println(0);
	}
}
