class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inti = sc.nextInt();
		int[] array;
		int i = 0;
		array = new int[inti];
		for (i = 0; i < inti; i++) {
			array[i] = sc.nextInt();
		}
		for (; i > 0; i--) {
			System.out.print(array[i - 1]);
			if (i - 1 != 0)
				System.out.print(" ");
		}
		System.out.println();
	}
}
