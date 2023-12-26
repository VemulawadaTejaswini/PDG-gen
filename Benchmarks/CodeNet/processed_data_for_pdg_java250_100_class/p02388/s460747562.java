class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		int x3 = (int)Math.pow(x, 3);
		System.out.println(x3);
	}
}
