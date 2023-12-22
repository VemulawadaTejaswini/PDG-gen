import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		if (n==100){n++;}
		System.out.println((int)Math.pow(100,d)*n);
	}
}