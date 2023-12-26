public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			int d = kb.nextInt();
			for (int j = 0; j < d; j++) {
				int l = kb.nextInt();
				a.add(l);
			}
		}
		int count = n;
		for (int i = 1; i <= n; i++) {
			for (int e : a) {
				if (i == e) {
					count -= 1;
					break;
				}
			}
		}
		System.out.println(count);
		kb.close();
	}
}
