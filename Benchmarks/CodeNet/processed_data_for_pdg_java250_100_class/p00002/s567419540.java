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
			 String out =Integer.toString(a+b);
			 System.out.println(out.length());
		}
	}
}
