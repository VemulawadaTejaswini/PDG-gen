public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1, x = scanner.nextInt(); x != 0; i++, x = scanner.nextInt()) {
			System.out.println("Case " + i + ": " + x);
		}
		scanner.close();
	}
}
