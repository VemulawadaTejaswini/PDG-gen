import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Sushi[] arr = new Sushi[n];
		for (int i = 0; i < n; i++) {
			Sushi s = new Sushi(sc.nextInt(), sc.nextInt());
			arr[i] = s;
		}
		Arrays.sort(arr, new Comparator<Sushi>() {
		public int compare(Sushi s1, Sushi s2) {
			return s2.d - s1.d;
		}
		});
		int[] counts = new int[100001];
		long count = 0;
		long value = 0;
		ArrayList<Sushi> klist = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			Sushi s = arr[i];
			if (counts[s.t] == 0) {
				count++;
			}
			counts[s.t]++;
			value += s.d;
		}
		long max = value + count * count;
		int j = k;
		for (int i = 0; i < k; i++) {
			Sushi s1 = arr[k - i - 1];
			if (counts[s1.t] < 2) {
				continue;
			}
			while (j < n) {
				Sushi s2 = arr[j];
				j++;
				if (counts[s2.t] == 0) {
					value = value - s1.d + s2.d;
					count++;
					counts[s1.t]--;
					counts[s2.t]++;
					long v = value + count * count;
					if (max < v) {
						max = v;
					}
					break;
				}
			}
		}
		System.out.println(max);
	}
	
	static class Sushi {
		int t;
		int d;
		public Sushi(int t, int d) {
			this.t = t;
			this.d = d;
		}
	}
	
}
