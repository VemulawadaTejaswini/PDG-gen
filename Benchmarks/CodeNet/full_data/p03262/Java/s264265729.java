import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	static ArrayList<Integer> dif = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int judge = 0;
		int dif_local = 0;

		for (int i = 0; i < N; i++) {
			int city = sc.nextInt();
			dif.add(Math.abs(city - X));
		}
		Collections.sort(dif);
		int min = dif.get(0);

		while (true) {
			judge = 0;
			for (Integer dif_city : dif) {
				if (dif_city % min != 0) {
					++judge;

				}

			}
			if (judge != 0) {
				--min;
			} else {
				break;
			}

		}

		System.out.println(min);

	}

}
