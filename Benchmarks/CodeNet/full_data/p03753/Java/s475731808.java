package Atcoder;

import java.util.Scanner;

public class Main {
	static int[] a;
	static byte[] cells;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int q = scan.nextInt();
		a = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = scan.nextByte();
		}
		scan.close();
		cells = new byte[n * 7];
		for (int i = 0; i < cells.length; i++) {
			cells[i] = 0;
		}

		for (int i = 0; i < q; i++) {
			int b = 0;
			while (m * b + a[i] < 7 * n) {
				cells[m * b + a[i]] |= 0x0001;
				b++;
			}
		}
		int count = 0;
		for (int i = 0; i < 7 * n; i++) {
			if ((cells[i] & 0x0011) == 0 && countNextTo(i) > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int countNextTo(int num) {
		if ((cells[num] & 0x0001) != 0 || (cells[num] & 0x0010) != 0||num<0) {
			return 0;
		}
		int count = 0;
//		if (num % 7 != 0) {
//			count += countNextTo(num - 1);
//		}
		if (num % 7 != 6 && num < cells.length - 1) {
			count += countNextTo(num + 1);
		}
//		if (num > 6) {
//			count += countNextTo(num - 7);
//		}
		if (cells.length - num > 7) {
			count += countNextTo(num + 7);
		}
		count++;
		cells[num] |= 0x0010;
		//System.out.println(count);
		return count;
	}
}
