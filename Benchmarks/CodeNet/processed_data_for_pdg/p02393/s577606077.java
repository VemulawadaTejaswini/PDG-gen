class Main {
	private static final String SPLIT_STR = " ";
	private static final String SPACE = " ";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		sc.close();
		String[] split = x.split(SPLIT_STR);
		List<Integer> list = new ArrayList<>(split.length);
		for (int i = 0; i < split.length; i++) {
			list.add(Integer.parseInt(split[i]));
		}
		Collections.sort(list);
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + SPACE);
		}
		System.out.println(list.get(list.size() - 1));
	}
}
