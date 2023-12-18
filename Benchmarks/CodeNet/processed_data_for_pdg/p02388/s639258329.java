class Main {
	public static void main(String[] args) throws IOException {
		PrintStream printStream = System.out;
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String input = bufferedReader.readLine();
		long x = Long.parseLong(input);
		printStream.println(x * x * x);
	}
}
