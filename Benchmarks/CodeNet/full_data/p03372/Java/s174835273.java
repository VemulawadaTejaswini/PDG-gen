import java.util.Scanner;

public class Main {

	static int n, v[];
	static long c, x[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = sc.nextLong();
		x = new long[n];
		v = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextInt();
		}

		boolean lastWorth = true;
		long pos = 0, value = 0, maxValue = 0;
		for (int i = 0; i < n; i++) {
			if (x[i] - pos >= v[i]) {
				if (lastWorth) {
					lastWorth = false;
					long tempPos = 0, tempValue = -pos;
					for (int j = n - 1; j >= i; j--) {
						tempValue += v[j] - ((c - x[j]) - tempPos);
						tempPos = (c - x[j]);
						maxValue = Math.max(value + tempValue, maxValue);
					}
				}
			} else {
				lastWorth = true;
			}
			value += v[i] - (x[i] - pos);
			pos = x[i];
			maxValue = Math.max(value, maxValue);
		}

		System.out.println(maxValue);
	}

}