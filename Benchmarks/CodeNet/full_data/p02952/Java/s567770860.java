public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int odd = 0;
		String tmp = null;

		for (int i = 1; i <= N; i++) {
			tmp = String.valueOf(i);
			if (tmp.length() % 2 != 0) {
				odd++;
			}
		}
		System.out.println(odd);
		sc.close();
	}
}