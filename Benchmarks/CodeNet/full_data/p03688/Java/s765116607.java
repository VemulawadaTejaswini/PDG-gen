package 郵便配達;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int ma = 0;
		int mi = Integer.MAX_VALUE >> 4;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			ma = Math.max(ma, a[i]);
			mi = Math.min(mi, a[i]);
		}
		int cnt_ma = 0, cnt_mi = 0;
		for (int i = 0; i < n; ++i) {
			if (ma == a[i]) {
				++cnt_ma;
			} else {
				++cnt_mi;
			}
		}
		if (ma == mi) {
			// cnt_maのみを考える
			if (ma == 1) {
				System.out.println("Yes");
				return;
			}
			if (ma == n - 1) {
				System.out.println("Yes");
				return;
			}
			System.out.println("No");
			return;
		}
		int v = ma - cnt_mi;
		if (v <= cnt_ma / 2 && v >= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
