public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<Integer> d = new HashSet<>();
		for (int i = 0; i < N; i++) {
			d.add(Integer.parseInt(br.readLine()));
		}
		System.out.println(d.size());
	}
}
