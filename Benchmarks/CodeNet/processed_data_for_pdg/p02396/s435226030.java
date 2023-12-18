public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			int a = Integer.parseInt(br.readLine());
			if (a == 0) {
				break;
			} else {
				list.add(a);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}
	}
}
