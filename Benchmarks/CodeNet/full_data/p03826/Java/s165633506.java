import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int A=s.nextInt(), B=s.nextInt();
		int C=s.nextInt(), D=s.nextInt();

		System.out.println(Math.max(A*B, C*D));

	}


}
