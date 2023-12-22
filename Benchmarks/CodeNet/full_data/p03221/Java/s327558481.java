import java.awt.Point;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("tc/1.txt"));
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int M = sc.nextInt();
		HashMap<Integer, TreeMap<Integer, Integer>> order = new HashMap<>();
		Point[] data = new Point[M];
		for (int i = 0; i < M; i++) {
			int pref = sc.nextInt();
			int year = sc.nextInt();
			TreeMap<Integer, Integer> pData = order.get(pref);
			if (pData == null) {
				pData = new TreeMap<Integer, Integer>();
			}
			pData.put(year, i);
			order.put(pref, pData);
			data[i] = new Point(pref, year);
		}
		for (int i = 0; i < M; i++) {
			int pref = data[i].x;
			int year = data[i].y;
			int yRank = 1;
			for (int j : order.keySet()) {
				if (j == pref) {
					TreeMap<Integer, Integer> pData = order.get(j);
					for (int k : pData.keySet()) {
						if (k == year) {
							break;
						}
						yRank++;
					}
					break;
				}
			}
			String result = String.format("%06d", pref) + String.format("%06d", yRank);
			System.out.println(result);
		}
		sc.close();
	}

}
