import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int d = Math.abs(a - b);
		int e = Math.abs(a - c);
		
		if (d >= e) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}