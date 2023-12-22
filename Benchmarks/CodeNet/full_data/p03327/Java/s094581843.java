import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String ans = (n<1000)?"ABC":"ABD";
		System.out.println(ans);
	}
}
