import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.print(s.charAt(0));
		s = sc.next();
		
		System.out.print(s.charAt(1));
		
		s = sc.next();
		System.out.print(s.charAt(2));
		sc.close();
	}
}