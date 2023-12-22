import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		char a = A.charAt(0);
		char b = A.charAt(2);
		if(a == 'H') {
			System.out.println(b);
		}
		if(a == 'D') {
			if(b == 'H') {
				System.out.println("D");
			}
			else {
				System.out.println("H");
			}
		}
	}
}
