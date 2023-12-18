class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int n = Integer.parseInt(str);
		System.out.println(n*n*n);
	}
}
