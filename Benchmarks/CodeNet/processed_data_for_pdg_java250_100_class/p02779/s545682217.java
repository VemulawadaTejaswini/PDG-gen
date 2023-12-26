public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> A = new HashSet<>();
		for (int i = 0; i < N; i++) {
			if (!A.add(sc.nextInt())) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}
}
