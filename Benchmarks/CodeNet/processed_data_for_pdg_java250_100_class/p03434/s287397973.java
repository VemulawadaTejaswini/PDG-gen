public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		boolean flag = true;
		int AliceMaxCount = 0;
		int BobMaxCount = 0;
		Iterator<Integer> i = list.iterator();
		while (i.hasNext()) {
			if (flag) {
				AliceMaxCount += i.next();
				flag = false;
			} else {
				BobMaxCount += i.next();
				flag = true;
			}
		}
		System.out.println(Math.abs(AliceMaxCount - BobMaxCount));
		sc.close();
	}
}
