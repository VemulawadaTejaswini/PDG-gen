import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = scan.nextInt();

		int a = N % 500;
		if(A>=a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}
	}

}
