import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int median(List<Integer> list) {
		int m;
		int n = list.size() / 2;

		m = list.get(n);

		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int space = 0;
		int median;
		List<Integer> m = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		space++;
		//mの作製
		//space=0
		for (int i = 0; i < N; i++) {
			m.add(a[i]);
		}
		//space>1
		while (space < N) {
			for (int i = 0; i + space < N; i++) {
				for (int j = i; j < i + space + 1; j++) {
					tmp.add(a[j]);
				}
				Collections.sort(tmp);
				m.add(median(tmp));
				tmp.clear();
			}
			space += 1;
		}

		//計算
		Collections.sort(m);
		median = median(m);

		//出力
		System.out.println(median);

		sc.close();
	}
}