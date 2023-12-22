import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();

		int X = Integer.parseInt(a + b);
		double Y = Math.sqrt(X);
		int Z = (int) Y;

		if (Y == Z) {
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}