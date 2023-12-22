import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int[][] c = new int[10][10];
		for (int i = 0; i <= 9; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j <= 9; j++) {
				c[i][j] = Integer.parseInt(sa[j]);
			}
		}
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < w; j++) {
				a[i][j] = Integer.parseInt(sa[j]);
			}
		}
		br.close();

		Obj[] arr = new Obj[10];
		for (int i = 0; i <= 9; i++) {
			Obj o = new Obj();
			o.idx = i;
			o.c = c[i][1];
			arr[i] = o;
		}
		Arrays.parallelSort(arr, new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				return o1.c - o2.c;
			}
		});

		for (int i = 2; i <= 9; i++) {
			Obj oi = arr[i];
			int min = Integer.MAX_VALUE;
			for (int j = 1; j <= i; j++) {
				Obj oj = arr[j];
				min = Math.min(min, c[oi.idx][oj.idx] + oj.c);
			}
			oi.c = min;
		}
		Arrays.parallelSort(arr, new Comparator<Obj>() {
			public int compare(Obj o1, Obj o2) {
				return o1.idx - o2.idx;
			}
		});

		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int aa = a[i][j];
				if (aa != -1) {
					ans += arr[aa].c;
				}
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int idx, c;
	}
}
