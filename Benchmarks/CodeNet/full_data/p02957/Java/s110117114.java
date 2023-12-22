
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int dis = Math.abs(A-B);
		if (dis%2==0) {
			System.out.println(Math.abs(Math.min(A, B)+dis/2));
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}


