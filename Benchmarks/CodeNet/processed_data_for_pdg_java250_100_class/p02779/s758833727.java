public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> list = new ArrayList<>();
		List<Long> anser = new ArrayList<>();
		for(int i = 0; i < N ; i++) {
			list.add(sc.nextLong());
		}
		TreeSet<Long> TS = new TreeSet<>(list);
		if(list.size() == TS.size()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
