import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int median(List<Integer> list) {
		int m;
		int n = list.size() / 2;

		Collections.sort(list);
		m = list.get(n);

		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int median;
		List<Integer> m = new ArrayList<Integer>();
		List<Integer> tmp = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				tmp.add(a[j]);
				m.add(median(tmp));
			}
			tmp.clear();
		}

		//計算
		Collections.sort(m);
		median = median(m);

		//出力
		System.out.println(median);

		sc.close();
	}
}