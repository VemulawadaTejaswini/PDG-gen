import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner (System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();

		if(a >= 13) {
			System.out.println(b);
		}else if(a >=6 && a <= 12) {
			System.out.println(b/2);
		}else {
			System.out.println("0\n");
		}
	}
}