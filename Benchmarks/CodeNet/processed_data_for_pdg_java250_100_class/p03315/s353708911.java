public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linr = br.readLine();
		int ans = 0;
		for (int i = 0; i < linr.length(); i++) {
			if (linr.charAt(i) == '+') {
				ans++;
			} else {
				ans--;
			}
		}
		System.out.println(ans);
	}
}
