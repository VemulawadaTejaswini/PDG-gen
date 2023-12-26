public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> s = new HashSet<>();
		for(int i=0; i<N; i++) {
			s.add(br.readLine());
		}
		System.out.println(s.size());
	}
}
