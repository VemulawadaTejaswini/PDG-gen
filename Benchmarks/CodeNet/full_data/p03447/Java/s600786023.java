import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		X-=A;
		while(X >= A) {
			X -= B;
		}
		System.out.println(X);
	}
}