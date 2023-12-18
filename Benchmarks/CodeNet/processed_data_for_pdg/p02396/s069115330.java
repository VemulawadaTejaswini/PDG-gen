class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int x = sc.nextInt();
			count++;
			if (x == 0) {
				break;
			}
			System.out.println("Case " + count + ": " + x);
		}
	}
}
