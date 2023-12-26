public class Main {
	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		Set<String> data = new HashSet<>();
		int num = Integer.parseInt(in.readLine());
		for(int i=0; i < num; i++) {
			data.add(in.readLine());
		}
		in.close();
		System.out.println(data.size());
	}
}
