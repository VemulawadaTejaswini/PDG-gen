import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if (a == b && b == c) {
			System.out.println(1);
		} else if (a == b || b == c || c == a){
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}
}