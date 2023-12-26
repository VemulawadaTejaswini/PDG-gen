public class Main {
	Main() {
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; sc.hasNext(); i++) {
			list.add(sc.nextInt());
		}
		int n5 = 0;
		int n7 = 0;
		for (int n : list)  {
			if (n == 5) {
				n5++;
			}
			if (n == 7) {
				n7++;
			}
		}
		System.out.println(n5 == 2 && n7 == 1 ? "YES" : "NO");
	}
}
