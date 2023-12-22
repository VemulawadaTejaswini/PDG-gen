
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con = 0;
		for (int i = 1; i < N+1; i++) {

			if (i != sc.nextInt()) {
				con++;
			}
		}

		if (con == 2 || con==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}