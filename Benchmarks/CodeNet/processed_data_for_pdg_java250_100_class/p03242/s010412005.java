public class Main {
	private static final int SUM = 999 + 111;
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			System.out.println(SUM - n);
		}
	}
}
