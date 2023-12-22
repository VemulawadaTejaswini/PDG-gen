import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		int y = (int)Math.sqrt(x);
		System.out.println(y*y);


	}

}
