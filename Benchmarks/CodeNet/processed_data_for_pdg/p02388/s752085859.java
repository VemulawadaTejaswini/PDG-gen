class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum = br.readLine();
		Integer num = Integer.parseInt(strNum);
		System.out.println(num*num*num);
	}
}
