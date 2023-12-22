import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long ans = (n%2==0)?n:2*(long)n;
		System.out.println(ans);

		
	}
}
