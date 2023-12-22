import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int r = in.nextInt();
		int D = in.nextInt();
		int x = in.nextInt();

		
		for ( int i = 0; i < 10; i++ ) {
			x = r*x - D;
			System.out.println(x);
		}

		in.close();
	}
}