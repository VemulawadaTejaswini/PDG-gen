import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int d = b-a;
		int ra = (d-1)*d/2;
		System.out.println(ra-a);
	}
}