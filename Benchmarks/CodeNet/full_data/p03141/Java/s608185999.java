import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Point[] P = new Point[N];
		for(int i = 0;i < N;i++) {
			P[i] = new Point(scn.nextLong(), scn.nextLong());
		}
		boolean chokudai = true;
		P = mergeSort(P);
		long ans = 0;
		for(int i = N-1;i > -1;i--) {
			if(chokudai) {
				ans += P[i].A;
			}else {
				ans -= P[i].B;
			}
			chokudai = !chokudai;
		}
		System.out.println(ans);

	}

	public static Point[] mergeSort(Point[] input) {
		// 分割の配列
		Point[] array = input;
		// 並び替えた数値を格納する配列。最終的にこの配列を返す。
		Point[] b = new Point[array.length];

		// 分割する添え字
		int middle = (0 + array.length - 1) / 2;
		// 分割した配列の前半分を格納する配列
		Point[] array1 = new Point[middle + 1];

		// 分割した配列の後ろ半分を格納する配列
		Point[] array2;
		// arrayの要素数が1以上のとき
		if (0 < array.length) {
			array2 = new Point[array.length - middle - 1];
			// arrayの要素数が0以下のとき
		} else {
			array2 = new Point[0];
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
		array1 = mergeSort(array1);

		// 後半部分を並び替え（再帰的に）
		array2 = mergeSort(array2);

		int bindex = 0;
		int array1index = 0;
		int array2index = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array1index < array1.length && array2index < array2.length) {
				if (array1[array1index].C < array2[array2index].C) {
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

class Point{
	long A,B,C;
	Point(long A, long B){
		this.A = A;
		this.B = B;
		C = A+B;
	}
}
