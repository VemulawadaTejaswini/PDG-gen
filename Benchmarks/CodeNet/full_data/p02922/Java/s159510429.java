import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int A = stdin.nextInt();
		int B = stdin.nextInt();
		stdin.close();
		if (B % A != 0) {
			System.out.println(B / A + 1);
		} else {
			System.out.println(B / A);
		}
	}

}