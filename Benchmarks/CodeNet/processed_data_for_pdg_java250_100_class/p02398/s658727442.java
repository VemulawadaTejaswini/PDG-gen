class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inta = sc.nextInt();
		int intb = sc.nextInt();
		int intc = sc.nextInt();
		int yakusuu = 0;
		for (int i = inta; i <= intb; i++) {
			if (intc % i == 0) {
				yakusuu++;
			}
		}
		System.out.println(yakusuu);
	}
}
