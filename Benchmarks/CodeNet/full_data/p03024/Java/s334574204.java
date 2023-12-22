import java.util.Scanner;

//M-SOLUTIONS プロコンオープン
//B - Sumo
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int xSum = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'x') {
				xSum++;
			}
		}

		System.out.println(xSum <= 7 ? "YES" : "NO");

	}
}
