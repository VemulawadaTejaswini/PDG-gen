import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] c = new String[h];
		
		for(int i = 0; i < h; i++) {
			c[i] = sc.nextLine();
		}
		
		for(int i = 0; i < h; i++) {
				System.out.println(c[i]);
				System.out.println(c[i]);
		}
	}
}