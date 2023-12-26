public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data;
		int cnt = 0;
		int alice = 0;
		int bob = 0;
		ArrayList<Integer> lists = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			lists.add(sc.nextInt());
		}
		Collections.sort(lists, Collections.reverseOrder());
		Iterator<Integer> it = lists.iterator();
		while (it.hasNext()) {
			data = it.next();
			if (cnt % 2 == 0) {
				alice = alice + data;
				cnt++;
			} else {
				bob = bob + data;
				cnt++;
			}
		}
		System.out.println(alice - bob);
	}
}
