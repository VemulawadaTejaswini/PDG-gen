import java.util.Scanner;

public class Main {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int h = s.nextInt();
		
		System.out.println((a+b)*h/2);
	}	
}
