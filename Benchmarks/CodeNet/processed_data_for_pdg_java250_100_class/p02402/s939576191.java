class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intmax = -1000000;
		int intmin = 1000000;
		long lonsum = 0;
		int inthakosuu = sc.nextInt();
		int[] hako;
		hako = new int[inthakosuu];
		for (int i = 0; i < inthakosuu; i++) {
			hako[i] = sc.nextInt();
			if (intmin > hako[i]) {
				intmin = hako[i];
			} if (intmax < hako[i]) {
				intmax = hako[i];
			}
			lonsum += hako[i];
		}
		System.out.println(intmin + " " + intmax + " " + lonsum);
	}
}
