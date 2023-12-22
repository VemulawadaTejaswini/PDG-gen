import java.util.Scanner;
public class Main {

	
	public static void main(String[]args) {
		
		Scanner tc = new Scanner(System.in);
		
		int x = tc.nextInt();
		int y = tc.nextInt();
		int z = tc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			z = x*y - z;
			System.out.println(z);
			
		}
	}
}
