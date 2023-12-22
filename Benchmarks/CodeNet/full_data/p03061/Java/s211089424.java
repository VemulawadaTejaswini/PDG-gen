import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int max;
	public static int[] a;
	public static int result;
	public static boolean end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int pmin = Integer.MAX_VALUE;
		a = new int[n];
		max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			} else if (pmin > a[i]) {
				pmin = a[i];
			}
		}
		if (pmin >= (int)10E11) {
			pmin = min;
		}
		result = 1;
		end = false;
		calc(0, 0, pmin);
		System.out.println(result);
	}
	
	public static int calc(int i, int count, int num) {
		if (num < 1) {
			end = true;
			return count;
		} else {
			if (end) {
				return count;
			} else if (i >= a.length && count <= 1) {
				if (result < num) {
					result = num;
				}
				end = true;
				return calc(0, 0, --num);
			} else {
				if (a[i] % num != 0 && ++count >= 2) {
					return calc(0, 0, --num);
				} else {
					return calc(++i, count, num);
				}
			}
		}
	}
}