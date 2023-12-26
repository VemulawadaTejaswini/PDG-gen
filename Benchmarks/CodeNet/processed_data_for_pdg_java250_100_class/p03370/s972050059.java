public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		int X = sc.nextInt();
		for (int index = 1; index <= N; index++) {
			int m = sc.nextInt();
			list.add(m);
			X = X - m;
		}
		if (X == 0) {
			System.out.println(N);
			return;
		}
		Collections.sort(list);
		int y = X / (list.get(0));
		System.out.println(N + y);
	}
}
