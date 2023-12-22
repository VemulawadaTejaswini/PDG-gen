public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 基本情報入力
			int N = scanner.nextInt();
			int T = scanner.nextInt();
			int heikinKion = scanner.nextInt();

			// ループしつつ、平均気温と、計算結果の絶対値差を記録する
			Map<Integer,Double> map = new HashMap<Integer, Double>();
			for (int i = 1; i <= N; i++) {
				map.put(i, Math.abs(heikinKion - (T - scanner.nextInt() * 0.006)));
			}

			// sort
			 List<Entry<Integer, Double>> list_entries = new ArrayList<Entry<Integer, Double>>(map.entrySet());
			Collections.sort(list_entries, new Comparator<Entry<Integer, Double>>(){
				@Override
				public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			});
			System.out.println(list_entries.get(0).getKey());

		}
	}
}