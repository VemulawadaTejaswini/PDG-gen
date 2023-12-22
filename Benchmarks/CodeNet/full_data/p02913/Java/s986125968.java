import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] a = new String[n];
		String s = sc.nextLine();
		Map<String, Integer> idx = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			a[i] = s.substring(i);
			idx.put(a[i], i);
		}
		Arrays.sort(a);
		int answer = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int current = 0;
			int j = 0;

			int ai = Math.min(idx.get(a[i]), idx.get(a[i + 1]));
			int bi = Math.max(idx.get(a[i]), idx.get(a[i + 1]));

			while (j < Math.min(a[i].length(), a[i + 1].length())) {
				if (a[i].charAt(j) != a[i + 1].charAt(j)) break;
				if (ai + current >= bi) break;
				current++;
				j++;
			}

			answer = Math.max(answer, current);
		}

		System.out.println(answer);
	}
}
