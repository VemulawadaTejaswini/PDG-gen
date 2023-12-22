import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		//解いたことがあるかカウンター
		int[] ac = new int[N];

		//答えカウンター
		int ok = 0;
		int ng = 0;

		for (int i = 0; i < M; i++) {
			//問題番号は配列のキーにあたる
			int indx = sc.nextInt();
			String acWa = sc.next();

			if (acWa.equals("AC")) {
				if (ac[indx - 1] == 1) {

				} else {
					ok++;
					ac[indx - 1] = 1;
				}
			} else {
				if (ac[indx - 1] == 1) {

				} else {
					ng++;
				}
			}
		}

		System.out.println(ok + " " + ng);
	}
}