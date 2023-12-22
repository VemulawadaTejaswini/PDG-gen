import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static long count;
	public static int m;
	public static long[] a;
	public static int[] b;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		m = sc.nextInt();
		
		
		a = new long[n];
		b = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextInt();
		}
		
		long[][] c = new long[n][2];
		
		List<Integer> used = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			int index = 0;
			long min = Long.MAX_VALUE;
			for (int j = 0; j < a.length; j++) {
				if (!used.contains(j) && min > a[j]) {
					min = a[j];
					index = j;
				}
			}
			c[i][0] = a[index];
			c[i][1] = b[index];
			used.add(index);
		}
		
		used = null;
		
		count = 0;
		long money = 0L;
		
		int tmp = 0;
		
		while (count < m) {
			for (int i = tmp; i < c.length; i++) {
				if (c[i][1] > 0) {
					long num = Math.min(m - count, c[i][1]);
					count += num;
					money += c[i][0] * num;
					c[i][1] -= num;
					break;
				} else {
					++tmp;
				}
			}
		}
		
		System.out.println(money);
	}
}
