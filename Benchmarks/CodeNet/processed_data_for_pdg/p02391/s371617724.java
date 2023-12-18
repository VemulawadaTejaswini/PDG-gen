public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		String ans = null;
		ans = a < b ? "a < b" : "a > b";
		if (a == b) {
			ans = "a == b";
		}
		System.out.println(ans);
	}
}
