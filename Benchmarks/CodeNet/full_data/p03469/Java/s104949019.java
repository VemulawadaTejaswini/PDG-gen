import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		String inS = stdin.next();
		System.out.println(inS.substring(0, 3) + "8" + inS.substring(4));
	}

}
