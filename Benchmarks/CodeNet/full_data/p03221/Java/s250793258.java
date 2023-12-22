package city;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[][] posArr = new int[M][2];
		for (int i = 0; i < M; i++) {
			posArr[i][0] = scanner.nextInt();
			posArr[i][1] = scanner.nextInt();
		}

		Map<Integer, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> tmpList = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			if (map.containsKey(posArr[i][0])) {
				map.get(posArr[i][0]).add(posArr[i][1]);
			} else {
				tmpList = new ArrayList<Integer>();
				tmpList.add(posArr[i][1]);
				map.put(posArr[i][0], tmpList);
			}
		}

		for (Integer key : map.keySet()) {
			ArrayList<Integer> list = map.get(key);
			Collections.sort(list);
			map.put(key, list);
		}

		int province = 0;
		int city = 0;
		for (int i = 0; i < M; i++) {
			province = posArr[i][0];
			city = map.get(province).indexOf(posArr[i][1])+1;
			System.out.println(String.format("%06d", province)+String.format("%06d", city));
		}
	}
}
