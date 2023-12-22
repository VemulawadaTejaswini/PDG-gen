import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int max;
	public static int[] a;
	public static int result;
	public static boolean end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		max = a[a.length - 1];
		result = 1;
		end = false;
		int count = 0;
		calc(0, 0, a[0]);
		if (a[0] - 1 >= 1) {
			calc(0, 0, a[0] - 1);
		}
		System.out.println(result);
	}
	
	public static int calc(int i, int count, int num) {
		if (num > max) {
			return count;
		} else {
			if (end) {
				return 0;
			}
			if (count >= a.length - 1) {
				if (result < num) {
					result = num;
				}
				end = true;
				--num;
				return calc(0, 0, --num);
			} else {
				if (i >= a.length) {
					--num;
					return calc(0, 0, --num);
				} else {
					if (a[i] % num == 0) {
						++count;
					}
					return calc(++i, count, num);
				}
			}
		}
	}
}
