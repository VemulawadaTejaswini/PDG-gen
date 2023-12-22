import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, HashSet<Integer>> networkMap = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			networkMap.put(i, new HashSet<>());
		}
		int[] color = new int[n - 1];
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 1;
			while (networkMap.get(a).contains(c) || networkMap.get(b).contains(c)) {
				c++;
			}
			networkMap.get(a).add(c);
			networkMap.get(b).add(c);
			color[i - 1] = c;
		}
		// 入力ここまで、K計算
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			k = Math.max(k, color[i]);
		}
		System.out.println(k);
		for (int i = 0; i < n - 1; i++) {
			System.out.println(color[i]);
		}
	}
}