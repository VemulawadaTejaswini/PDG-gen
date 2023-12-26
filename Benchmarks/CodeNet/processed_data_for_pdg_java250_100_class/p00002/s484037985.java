class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String tmp = in.readLine();
			if (tmp == null) {
				break;
			}
			String[] ab = tmp.split(" ");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			int i = 0;
			while (true) {
				i++;
				if (Math.pow(10, i) > a + b) {
					break;
				}
			}
			System.out.println(i);
		}
	}
}
