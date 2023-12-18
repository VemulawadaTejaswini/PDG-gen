public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		while (true) {
			cnt++;
			int input = Integer.parseInt(br.readLine());
			if (input == 0) {
				break;
			}
			System.out.println("Case " + cnt + ": " + input);
		}
	}
}
