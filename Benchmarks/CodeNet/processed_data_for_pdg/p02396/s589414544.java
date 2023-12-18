class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int i = 0;
		while (x != 0) {
			i++;
			System.out.println("Case " + i + ": " + x);
			x = scanner.nextInt();
		}
	}
}
