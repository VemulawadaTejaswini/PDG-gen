public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int result = 0;
		ListIterator<Integer> i = list.listIterator();
		while (i.hasNext()) {
			if (i.nextIndex() % 2 == 0) {
				result += i.next();
			} else {
				result -= i.next();
			}
		}
		System.out.println(Math.abs(result));
		sc.close();
	}
}
