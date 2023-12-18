public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		int n = 0;
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			System.out.println("Case " + i + ": " + n);
			i++;
		}
	}
}
