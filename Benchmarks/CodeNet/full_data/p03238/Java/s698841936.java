import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.nextLine());
		if (N == 1) {
			System.out.println("Hello World");
		} else {
			int A = Integer.parseInt(in.nextLine());
			int B = Integer.parseInt(in.nextLine());
			System.out.println(A + B);
		}
		in.close();

	}

}