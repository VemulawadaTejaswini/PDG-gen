import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		long c = scanner.nextInt();
		
		if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
