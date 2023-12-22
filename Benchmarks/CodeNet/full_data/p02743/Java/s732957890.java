import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		long c = input.nextLong();
		if (c>a+b+2*(double)Math.sqrt(a*b)) System.out.println("Yes");
		else System.out.println("No");
	}
}