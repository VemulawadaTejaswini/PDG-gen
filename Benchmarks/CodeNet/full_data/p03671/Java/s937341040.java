import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println(b + c);
		} else if (b >= a && b >= c) {
			System.out.println(a + c);
		} else {
			System.out.println(b + a);			
		}
	} 
}
