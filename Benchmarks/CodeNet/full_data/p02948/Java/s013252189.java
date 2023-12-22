import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
//		int[] A = new int[N];
//		int[] B = new int[N];
		int idx;
		int A, B;
		ArrayList<Integer> bList;
		HashMap<Integer, ArrayList<Integer>> bMap = new HashMap<Integer, ArrayList<Integer>>();
		for (idx = 0; idx < N; idx++) {
			A = Integer.parseInt(sc.next());
			B = Integer.parseInt(sc.next());
			bList = bMap.get(A);
			if (bList == null) {
				bList = new ArrayList<Integer>();
				bMap.put(A, bList);
			}
			bList.add(B);
		}
		ArrayList<Integer> keyList = new ArrayList<>(bMap.keySet());
		for (Integer keys : keyList) {
			Collections.sort(bMap.get(keys), Collections.reverseOrder());
		}

		int d;
		int maxday;
		int maxval;
		long sum = 0;
		ArrayList<Integer> valList;
		for (idx = 1; idx <= M; idx++) {
			maxday = 0;
			maxval = 0;
			// 1～idx日目の最大をとる
			for (d = 1; d <= idx; d++) {
				valList = bMap.get(d);
				if (valList != null&& valList.size() > 0) {
					if (maxval < valList.get(0)) {
						maxday = d;
						maxval = valList.get(0);
					}
				}
			}
			//加算
			if (maxday > 0) {
				valList = bMap.get(maxday);
				valList.remove(0);
				sum += maxval;
			}

		}

		System.out.println(sum);

	}

}
