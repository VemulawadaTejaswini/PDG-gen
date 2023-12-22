public class Main {
	private static Map<String,Long> map = new HashMap<String,Long>();
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
		String key = publishKey(a);
		Long res = map.get(key);
		if(res!=null) {
			return res;
		}
		if (a.length <= 2) {
			return a[0] + a[1];
		}
		res = calc(eat(a, getMinIndex(a)));
		map.put(key, res);
		return res;
	}

	public static String publishKey(long a[]) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++) {
			sb.append(a[i]).append(' ');
		}
		return sb.toString();
	}

	public static int getMinIndex(long a[]) {
		long min = a[1] * (a.length-2);
		int minInd = 1;
		for (int i = 2; i < a.length - 1; i++) {
			long val = (a.length - 2 == i) ? a[i] * (a.length-2) : a[i] * (a.length-1);
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
