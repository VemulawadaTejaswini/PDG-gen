import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean[] check = new boolean[100001];

		int n = Integer.parseInt(scn.next());

		int count = 0;
		int count_2 = 0;

		boolean first_flag = true;
		int first_m = 0;
		int last_m = 0;
		int tmp = 0;
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(scn.next());
			if (!check[m]) {
				count++;
				check[m] = true;
				last_m = m;
				if (first_flag) {
					first_m = m;
					first_flag = false;
				}
			} else {
				count_2++;
				tmp = m;
			}
		}
		scn.close();

		if (count_2 == 1) {
			if (tmp == first_m || tmp == last_m) {
				count--;
			}
		}

		System.out.println(count);
	}
}