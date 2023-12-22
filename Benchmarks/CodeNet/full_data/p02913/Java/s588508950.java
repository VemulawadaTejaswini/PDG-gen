import java.util.*;

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
		for (int i = 1; i < a.length; i++) {
			int current = 0;

			int l = 0;
			int r = i;
			while (l < r) {
				int mid = (l + r) / 2;
				if (a[mid].charAt(0) < a[i].charAt(0)) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}

			while (l < i) {
				int ai = Math.min(idx.get(a[l]), idx.get(a[i]));
				int bi = Math.max(idx.get(a[l]), idx.get(a[i]));

				while (current < Math.min(a[l].length(), a[i].length())) {
					if (a[l].charAt(current) != a[i].charAt(current)) break;
					if (ai + current >= bi) break;
					current++;
				}
				l++;
			}

			answer = Math.max(answer, current);
		}

		System.out.println(answer);
	}
}
