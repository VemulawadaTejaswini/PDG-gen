public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while (true) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				break;
			}
			System.out.println("Case" + " " + (i++) + ":" + " " + x);
		}
	}
}
