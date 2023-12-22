import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		switch (N) {
			case 1:
				sc.close();
				System.out.println("Hello World");
				break;	
			case 2:
				int A = sc.nextInt();
				int B = sc.nextInt();
				sc.close();
				System.out.println(A + B);
				break;
			default:
				break;
		}
	}
}