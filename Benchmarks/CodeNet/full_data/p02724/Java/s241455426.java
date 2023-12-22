import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = a/500;
		b=b*1000;
		long c = a%500;
		c = c-c%5;
		System.out.print(b+c);
	}
}
