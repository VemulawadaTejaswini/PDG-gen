public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(A);
		list.add(B);
		list.add(C);
		int v = 1;
		Set<Integer> checkHash = new HashSet<Integer>();
		for (int value : list) {
			if (checkHash.contains(value)) {
				v = v + 1;
			} else {
				checkHash.add(value);
			}
		}
		if (v == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
