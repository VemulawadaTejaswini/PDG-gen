public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		int x = 0;
		List<Integer> list = new ArrayList<>();
		do {
			String str1 = br.readLine();
			x = Integer.parseInt(str1);
			if (x != 0) {
				list.add(x);
			}
		} while (x != 0);
		for (i = 0; i < list.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}
	}
}
