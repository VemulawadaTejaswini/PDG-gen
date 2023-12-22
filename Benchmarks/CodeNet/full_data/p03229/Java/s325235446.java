import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scn.nextInt();
		}
		A = Sort(A);
		long ans = 0;

		int a = 0, b = N - 1;
		int l = A[a], r = A[b];
		ans += Math.abs(l - r);
		a++;
		b--;
		boolean turn_a = true;
		while (a <= b) {
			if (turn_a) {
				int ca = A[a];
				if (Math.abs(l - ca) > Math.abs(r - ca)) {
					ans += Math.abs(l - ca);
					l = ca;
				} else {
					ans += Math.abs(r - ca);
					r = ca;
				}
				a++;
			} else {
				int cb = A[b];
				if (Math.abs(l - cb) > Math.abs(r - cb)) {
					ans += Math.abs(l - cb);
					l = cb;
				} else {
					ans += Math.abs(r - cb);
					r = cb;
				}
				b--;
			}
			turn_a = !turn_a;

		}

		System.out.println(ans);
		scn.close();
	}

	public static int[] Sort(int[] a) {
		// 分割の配列
		int[] array = a;
		// 並び替えた数値を格納する配列。最終的にこの配列を返す。
		int[] b = new int[array.length];

		// 分割する添え字
		int middle = (0 + array.length - 1) / 2;
		// 分割した配列の前半分を格納する配列
		int[] array1 = new int[middle + 1];

		// 分割した配列の後ろ半分を格納する配列
		int[] array2;
		// arrayの要素数が1以上のとき
		if (0 < array.length) {
			array2 = new int[array.length - middle - 1];
			// arrayの要素数が0以下のとき
		} else {
			array2 = new int[0];
		}

		// 要素数が1以下のときは、何もせず返却する
		if (array.length < 2) {
			return array;
		}
		// 前半部分をarray1にコピー
		System.arraycopy(array, 0, array1, 0, middle + 1);

		// 後半部分をarray1にコピー
		System.arraycopy(array, middle + 1, array2, 0, array.length - middle - 1);

		// 前半部分を並び替え（再帰的に）
		array1 = Sort(array1);

		// 後半部分を並び替え（再帰的に）
		array2 = Sort(array2);

		int bindex = 0;
		int array1index = 0;
		int array2index = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array1index < array1.length && array2index < array2.length) {
				if (array1[array1index] < array2[array2index]) {
					b[bindex] = array1[array1index];
					array1index++;
				} else {
					b[bindex] = array2[array2index];
					array2index++;
				}
				bindex++;
			}
		}
		if (array1index > array2index) {
			for (int j = array2index; j < array2.length; j++, bindex++) {
				b[bindex] = array2[j];
			}
		} else {
			for (int j = array1index; j < array1.length; j++, bindex++) {
				b[bindex] = array1[j];
			}
		}
		return b;
	}

}
