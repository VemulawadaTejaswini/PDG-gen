import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();

		boolean can = false;

		for (int i = 0; i <= A; i++) {

			if((N-A)%5 == 0) {
				can = true;
				continue;
			}
		}
		if(can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
