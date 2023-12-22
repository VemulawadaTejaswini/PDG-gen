
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String ans = "";
		ans = calc(n) ? "Yes" : "No";
		System.out.println(ans);
	}


	public static boolean calc(int n) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j == n)
					return true;
			}
		}
		return false;
	}

}
