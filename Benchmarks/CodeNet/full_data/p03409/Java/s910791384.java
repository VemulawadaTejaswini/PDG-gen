import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] red = new int[n][2];
		int[][] blue = new int[n][2];
		for (int i = 0; i < n; i++) {
			red[i][0] = sc.nextInt();
			red[i][1] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			blue[i][0] = sc.nextInt();
			blue[i][1] = sc.nextInt();
		}

		Arrays.sort(red, (a, b) -> Integer.compare(a[0], b[0]));
		Arrays.sort(blue, (a, b) -> Integer.compare(a[0], b[0]));

		NavigableSet<int[]> set = new TreeSet<>((a, b) -> Integer.compare(a[1], b[1]));
		int ri = 0;
		int answer = 0;
		for (int bi = 0; bi < n; bi++) {
			while (ri < n && red[ri][0] < blue[bi][0]) {
				set.add(red[ri++]);
			}
			if (set.isEmpty()) continue;
			int[] x = set.lower(blue[bi]);
			if (x == null) continue;
			set.remove(x);
			answer++;
		}

		System.out.println(answer);
	}
}
