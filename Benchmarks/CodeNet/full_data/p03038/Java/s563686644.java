import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Obj[] arr = new Obj[m];
		for (int i = 0; i < m; i++) {
			Obj o = new Obj();
			o.b = sc.nextInt();
			o.c = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.parallelSort(a);
		Arrays.parallelSort(arr);

		int k = 0;
		end:
		for (int i = 0; i < arr.length; i++) {
			Obj o = arr[i];
			for (int j = 0; j < o.b && k < n; j++, k++) {
				if (a[k] < o.c) {
					a[k] = o.c;
				} else {
					break end;
				}
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}

	static class Obj implements Comparable<Obj>{
		int b, c;

		public int compareTo(Obj o) {
			return o.c - c;
		}
	}
}
