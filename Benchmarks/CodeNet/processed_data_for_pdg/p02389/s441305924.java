public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.print(x * y);
		System.out.print(" ");
		System.out.println(2 * x + 2 * y);
		scanner.close();
	}
}
