public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextLong();
		}
		System.out.println(calc(a));

	}

	public static long calc(long a[]) {
		if (a.length <= 2) {
			return a[0] + a[1];
		}
		return calc(eat(a, getMinIndex(a)));
	}

	public static int getMinIndex(long a[]) {
		long min = a[1] * 3;
		int minInd = 1;
		for (int i = 2; i < a.length - 1; i++) {
			long val = (a.length - 2 == i) ? a[i] * 3 : a[i] * 4;
			if (val < min) {
				min = val;
				minInd = i;
			}
		}
		return minInd;
	}

	public static long[] eat(long a[], int ind) {
		long newa[] = new long[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (ind > i) {
				newa[i] = a[i];
			} else if (ind < i) {
				newa[i - 1] = a[i];
			}
		}
		newa[ind - 1] += a[ind];
		newa[ind] += a[ind];
		return newa;
	}
}