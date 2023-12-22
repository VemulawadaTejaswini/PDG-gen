import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		long c = scanner.nextInt();
		
		double A = Math.sqrt(a);
		double B = Math.sqrt(b);
		double C = Math.sqrt(c);
		
		if(A+B<C) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
