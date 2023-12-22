import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 基本情報入力
			int N = scanner.nextInt();
			int T = scanner.nextInt();
			int heikinKion = scanner.nextInt();

			// ループしつつ、平均気温と、計算結果の絶対値差を記録する
			Map<Integer,Integer> map = new HashMap<Integer, Integer>();
			for (int i = 1; i <= N; i++) {
				map.put(i, heikinKion - (int)(T - scanner.nextInt() * 0.006));
			}

			// sort
			 List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
			Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>(){
				@Override
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			});
			System.out.println(list_entries.get(0).getKey());

		}
	}
}