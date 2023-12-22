	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		Integer array[] = new Integer[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		s.close();
		System.out.println(Main.calc(n, x, array));
	}

	private static int calc(int n, int x, Integer[] array) {
		java.util.Arrays.sort(array);
		int okasi = x;
		int res = 0;
		for (int i = 0; i < array.length && i < n; i++) {
			if (okasi >= array[i]) {
				okasi -= array[i];
				res++;
			} else {

				break;
			}
		}
		if(res>=1 && okasi>=1) {
			res--;
		}
		return res;
	}