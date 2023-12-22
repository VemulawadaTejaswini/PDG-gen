import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if (a == b) {
			System.out.println(c);
		} else if (b == c) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}