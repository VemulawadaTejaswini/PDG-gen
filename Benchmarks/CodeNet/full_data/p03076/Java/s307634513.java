import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		sc.close();

		int aa = a % 10;
		int ba = b % 10;
		int ca = c % 10;
		int da = d % 10;
		int ea = e % 10;

		int sum = 0;

		if (aa == 0) {
			sum += a;
		}
		if (ba == 0) {
			sum += b;
		}
		if (ca == 0) {
			sum += c;
		}
		if (da == 0) {
			sum += d;
		}
		if (ea == 0) {
			sum += e;
		}

		TreeMap<Integer, Integer> list = new TreeMap<Integer, Integer>();

		if (aa != 0) {
			list.put(aa, a);
		}
		if (ba != 0) {
			list.put(ba, b);
		}
		if (ca != 0) {
			list.put(ca, c);
		}
		if (da != 0) {
			list.put(da, d);
		}
		if (ea != 0) {
			list.put(ea, e);
		}

		Integer[] arr = new Integer[list.size()];
		list.values().toArray(arr);

		sum += arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum += Math.ceil(arr[i] / 10.0) * 10;
		}

		System.out.print(sum);
	}

}