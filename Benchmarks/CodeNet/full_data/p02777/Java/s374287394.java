import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String t = scan.next();
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		String u = scan.next();
		
		if (u.equals(s)) {
			System.out.println((a-1) + " " + b);
		} else if (u.equals(t)) {
			System.out.println((a) + " " + (b-1));
		}
		
	}

}