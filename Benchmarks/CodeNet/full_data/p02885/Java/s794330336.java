import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		int ans = A - B * 2;

		if(A - B * 2 <=  0) {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
	}
}