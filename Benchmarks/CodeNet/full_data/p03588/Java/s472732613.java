import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		int ans = solve();
		System.out.println(ans);
	}
	
	private static int solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			int rank = sc.nextInt();
			int score = sc.nextInt();
			map.put(rank, score);
		}
		sc.close();
		
		List<Integer> ranks = new ArrayList<>();
		for (Integer key : map.keySet()) {
			ranks.add(key);
		}
		Collections.sort(ranks);
		
		int tempFirst = ranks.get(0);
		int tempLast = ranks.get(ranks.size() - 1);
		
		int tempLastScore = map.get(tempLast);
		
		return (tempLast - tempFirst + 1 + (tempFirst - 1) + tempLastScore);
	}
}