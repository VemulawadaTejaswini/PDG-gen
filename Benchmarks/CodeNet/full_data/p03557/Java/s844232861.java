import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = scan.nextInt();
		}

		List<Integer> Alist = int2List(a);
		List<Integer> Clist = int2List(c);
		long Acnt = 0;
		long Ccnt = 0;
		long ans = 0;


		for (int i = 0; i < n; i++) {
			Acnt += ~Collections.binarySearch(Alist, b[i], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
			Ccnt += n - (~Collections.binarySearch(Clist, b[i], (x, y) -> x.compareTo(y) >= 0 ? 1 : -1));
			ans += (Acnt*Ccnt);
			Acnt = Ccnt = 0;
		}

		System.out.println(ans);
	}

//int配列をList<Integer>に変換するヘルパーメソッド
	static List<Integer> int2List(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list;
	}
}

