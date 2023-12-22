import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = a - b;
		
		if (a < b) {
			System.out.println(0);
		} else {
			System.out.println(c);
		}
	}
}