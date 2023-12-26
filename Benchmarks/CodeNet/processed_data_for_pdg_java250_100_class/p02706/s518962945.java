public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		for (int i = 0; i < m; i++) {
			int j = kb.nextInt();
			n -= j;
		}
		if (n >= 0) {
			System.out.println(n);
		} else {
			System.out.println(-1);
		}
		kb.close();
	}
}
