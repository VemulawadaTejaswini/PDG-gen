public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		String S = scanner.next();
		int num = S.length();
		String x ="";
		if (num <= K) {
			System.out.println(S);
		} else {
			System.out.println(S.substring(0, K) + "...");
		}
	}
}
