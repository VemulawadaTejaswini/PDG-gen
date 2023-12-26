public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		List<Integer> mochiList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			mochiList.add(sc.nextInt());
		}
		Collections.sort(mochiList);
		List<Integer> mochiList2 = new ArrayList<Integer>(new LinkedHashSet<>(mochiList));
		System.out.print(mochiList2.size());
	}
}
