public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		if (a >= 1 && b <= 100) {
			System.out.println((a * b) + " " + (2 * a + 2 * b));
		}
	}
}
