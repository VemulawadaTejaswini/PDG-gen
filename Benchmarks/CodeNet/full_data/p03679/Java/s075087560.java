import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(B - A < 0) {
			System.out.println("delicious");
		} else if (B - A >=0) {
			if(X >= B - A) {
				System.out.println("safe");
			} else if(X < B - A) {
				System.out.println("dangerous");
			}
		}
	}
}
