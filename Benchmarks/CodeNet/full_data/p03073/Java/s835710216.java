
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n = s.length();

		boolean[] list0 = new boolean[n];
		boolean[] list1 = new boolean[n];
		int x  = 0;
		int xx = 1;

		for(int i = 1; i <= n; i++) {

			int y = (int) s.charAt(i - 1) - 48;

			if(i % 2 != 0) {

				list0[i - 1] = XOR(x, y);
				list1[i - 1] = XOR(xx, y);

			}else {

				list0[i - 1] = XOR(xx, y);
				list1[i - 1] = XOR(x, y);
			}
		}

		int ans0 = 0;
		int ans1 = 0;

		for(int i = 0; i < n; i++) {

			if(list0[i]) {
				ans0++;
			}
			if(list1[i]) {
				ans1++;
			}

		}

		System.out.println(Math.min(n - ans0, n - ans1));



	}

	public static boolean XOR(int x, int y) {

		if(x == y) {
			return true;
		}

		return false;
	}

}