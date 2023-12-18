class Main {
	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println(num*num*num);
	}
}
