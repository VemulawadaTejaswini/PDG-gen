import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 6; i++) {
			list.add((int) Math.pow(9, i));
		}
		for (int i = 1; i <= 7; i++) {
			list.add((int) Math.pow(6, i));
		}
		Collections.sort(list, Comparator.reverseOrder());

		int cnt = 0;
		for (Integer num : list) {
			boolean flg = true;
			while (flg) {
				if (N >= num) {
					N = N - num;
					cnt++;
				} else {
					flg = false;
				}
			}
		}
		System.out.println(cnt + N);
	}

}
