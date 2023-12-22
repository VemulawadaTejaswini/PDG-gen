

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		int[] P = new int[M];
		int[] Y = new int[M];
		Map<Integer, List<Integer>> map = new HashMap<>();
		List<Integer> value = new ArrayList<>();
		int key;

		for (int i = 0; i < M; i++) {
			key = Integer.parseInt(scan.next());
			P[i] = key;
			value = map.get(key);
			if(value == null) {
				value = new ArrayList<>();
			}
			Y[i] = Integer.parseInt(scan.next());
			value.add(Y[i]);
			map.put(key, value);
		}

		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			Collections.sort(entry.getValue());
		}

		for (int i = 0; i < M; i++) {
			System.out.print(String.format("%06d", P[i]));
			System.out.println(String.format("%06d", getNumber(Y[i],map.get(P[i]))));
		}

	}

	private static int getNumber(int value, List<Integer> value_list) {
		int num = 1;
		for(int v :value_list) {
			if(value == v) {
				return num;
			}
			num++;
		}
		return num;
	}
}
