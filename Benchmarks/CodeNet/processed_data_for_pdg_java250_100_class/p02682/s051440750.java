class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int k = s.nextInt();
		int sum = 0;
		if (k > a) {
			k = k - a;
			sum += a;
			if (k > b) {
				k = k - b;
				if (k > 0) {
					sum -= k;
				}
			}
		} else {
			sum = k;
		}
		System.out.println(sum);
	}
}
