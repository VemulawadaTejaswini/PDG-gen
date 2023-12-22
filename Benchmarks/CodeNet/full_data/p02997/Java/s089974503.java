import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		// 条件を満たせるかチェック
		int sum = 0;
		for (int i = n-2; i > 0; i--) {
			sum += i;
		}
		if (sum < k) {
			System.out.println(-1);
		}

		List<String> graph = new ArrayList<>();
		// まず最短距離2が最多になるグラフを書く
		for (int i = 2; i <= n; i++) {
			graph.add("1 " + i);
		}
		// この時点で達成していたら終了
		if (sum == k) {
			print(graph);
			return;
		}
		// 最短距離2の組み合わせがk個になるまで要素をつなげていく
		for (int i = 2; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				graph.add(i + " " + j);
				sum--;
				if (sum == k) {
					print(graph);
					return;
				}
			}
		}
	}

	private static void print(List<String> graph) {
		System.out.println(graph.size());
		for (String pear : graph) {
			System.out.println(pear);
		}
	}
}
