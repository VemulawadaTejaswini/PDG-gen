class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cut = input.split(" ");
		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a == b) {
			System.out.println("a == b");
		}
	}
}
