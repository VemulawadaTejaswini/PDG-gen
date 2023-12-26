class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intN = sc.nextInt();
		int i = 0;
		int x = 0;
		for (i = 1; i <= intN; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else if (i % 10 == 3) {
				System.out.print(" " + i);
			} else if (i / 1000 == 3) {
				System.out.print(" " + i);
			} else if ((x = i % 1000) / 100 == 3) {
				System.out.print(" " + i);
			} else if ((x = x % 100) / 10 == 3) {
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
}
