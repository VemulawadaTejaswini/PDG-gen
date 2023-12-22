import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] len = new Integer[n];
		for ( int i = 0; i < n; i++ ) {
			len[i] = in.nextInt();
		}
		Arrays.sort(len);

		int cnt = 0;
		// x, yを比べて等しい時、x > yとみなすコンパレータ
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {				
				return o1.compareTo(o2) >= 0 ? 1 : -1;
			}
		};
		
		for ( int e1 = 0; e1 < n - 2; e1++ ) {
			for ( int e2 = e1 + 1; e2 < n - 1; e2++ ) {
				int d = len[e1] + len[e2];
				// LowerBoundを取りたい
				int i = Arrays.binarySearch(len, d, com);
				i = i >= 0 ? i : ~i;
				cnt += Math.max(i - e2 - 1, 0);
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
