import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.a = Integer.parseInt(sa[i]);
			arr[i] = o;
		}
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i].b = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] a = new int[n];
		Arrays.parallelSort(arr, (o1, o2) -> o1.a - o2.a);
		for (int i = 0; i < n; i++) {
			arr[i].i = i;
			a[i] = arr[i].a;
		}
		Arrays.parallelSort(arr, (o1, o2) -> o1.b - o2.b);

		int[] cnt = new int[n];
		int x = 0;
		for (int i = 0; i < n; i++) {
			while (x < n && a[x] <= arr[i].b) {
				x++;
			}
			cnt[i] = x;
		}

		boolean flg = false;
		for (int i = 0; i < n; i++) {
			if (cnt[i] < i + 1) {
				System.out.println("No");
				return;
			}
			if (cnt[i] > i + 1) {
				flg = true;
			}
		}
		if (flg) {
			System.out.println("Yes");
			return;
		}

		int cnt2 = 0;
		int y = arr[0].i;
		while (y != 0) {
			y = arr[y].i;
			cnt2++;
		}
		if (cnt2 > n - 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

	static class Obj {
		int i, a, b;
	}
}
