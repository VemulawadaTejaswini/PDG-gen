import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if (a == 1) {
			a = 14;
			if (b == 1) {
				b = 14;
			}
		} else if (b == 1) {
			b = 14;
			if (a == 1) {
				a = 14;
			}
		} else {
			
		}
		
		if (a > b) {
			System.out.println("Alice");
		} else if (a == b){
			System.out.println("Draw");
		} else {
			System.out.println("Bob");
		}
	}
}