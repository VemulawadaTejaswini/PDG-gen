import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();

		String res = (r*100+g*10+b)%4==0 ? "YES":"NO";

		System.out.println(res);
	}

}