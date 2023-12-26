public class Main {
	public static void main(String[] args) throws IOException {
		TreeSet<String> input = new TreeSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Collections.addAll(input, br.readLine().split(" "));
		System.out.println(input.size() != num ? "NO" : "YES");
	}
}
