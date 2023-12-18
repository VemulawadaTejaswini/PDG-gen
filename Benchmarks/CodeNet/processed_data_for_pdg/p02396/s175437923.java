class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, i = 0;
		while (true) {
			i++;
			x = scanner.nextInt();
			if (x == 0)
				break;
			System.out.println("Case " + i + ": " + x);
		}
	}
}
