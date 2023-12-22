import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = a * 800;
		
		if (a >= 15) {
			System.out.println(b - 200 * Math.floor(a/15));
		} else {
			System.out.println(b);
		}
	}
}