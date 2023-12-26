public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> numberSet = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			if (!numberSet.add(sc.nextInt())) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}
}
