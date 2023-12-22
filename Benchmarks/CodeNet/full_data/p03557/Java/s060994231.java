import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sA = br.readLine().split(" ", n);
		String[] sB = br.readLine().split(" ", n);
		String[] sC = br.readLine().split(" ", n);
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(sA[i]);
			arrB[i] = Integer.parseInt(sB[i]);
			arrC[i] = Integer.parseInt(sC[i]);
		}
		Arrays.sort(arrA);
		Arrays.sort(arrC);
		long total = 0;
		for (int i = 0; i < n; i++) {
			int l = 0;
			int r = n;
			while (l < r) {
				int m = (l + r) / 2;
				if (arrA[m] >= arrB[i]) {
					r = m;
				} else {
					l = m + 1;
				}
			}
			int countA = l;
			l = 0;
			r = n;
			while (l < r) {
				int m = (l + r) / 2;
				if (arrC[m] > arrB[i]) {
					r = m;
				} else {
					l = m + 1;
				}
			}
			int countC = n - l;
			total += countA * countC;
		}
		System.out.println(total);
	}
}
