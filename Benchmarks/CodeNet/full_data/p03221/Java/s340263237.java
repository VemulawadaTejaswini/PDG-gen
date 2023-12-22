import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < M; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			map.put(Y, new ArrayList<Integer>(Arrays.asList(P,i)));
		}
		String ans[] = new String[M];
		int cnt[] = new int[N+1];
		for (List<Integer> list : map.values()) {
			ans[list.get(1)] = String.format("%06d%06d", list.get(0), ++cnt[list.get(0)]);
		}
		for (int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
}
