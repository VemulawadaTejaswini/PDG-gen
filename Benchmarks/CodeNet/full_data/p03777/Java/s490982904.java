import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		if(a.equals("D")) {
			if(b.equals("H")) {
				 b = "D";
			} else {
				b = "H";
			}
		}
		System.out.println(b);
	}
}