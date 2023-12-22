import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			map.put(a[i], i+1);
		}
		Arrays.sort(a);

		StringBuilder ans = new StringBuilder();
		for (Integer i : a) {
			ans.append(map.get(i));
			ans.append(" ");
		}

		System.out.println(ans);
	}
}