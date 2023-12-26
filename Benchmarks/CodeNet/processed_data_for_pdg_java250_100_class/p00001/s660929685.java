public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Integer> lines = new ArrayList<>();
			while(sc.hasNext()) {
				lines.add(Integer.parseInt(sc.nextLine()));
			}
			lines.sort(Comparator.reverseOrder());
			int len = Math.min(lines.size(), 3);
			for (int i = 0; i < len; i++) {
				System.out.println(lines.get(i));
			}
		}
	}
}
