import java.util.Scanner;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'A') {
			System.out.println("T");
		}
		else if(ch == 'T') {
			System.out.println("A");
		}
		else if(ch == 'C') {
			System.out.println("G");
		}
		else {
			System.out.println("C");
		}
	}
}