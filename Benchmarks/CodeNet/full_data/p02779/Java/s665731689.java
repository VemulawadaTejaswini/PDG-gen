import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Boolean flg = false;

		ArrayList<Integer> inlist = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			int n = sc.nextInt();

			if (inlist.contains(n)) {

				flg = true;

			}

			inlist.add(n);
		}

		if (flg) {

			System.out.println("NO");

		} else {
			System.out.println("YES");
		}

	}

}
