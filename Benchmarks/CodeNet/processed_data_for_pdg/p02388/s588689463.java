class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String buf = br.readLine();
		 int x = Integer.parseInt(buf);
		 x = x * x * x;
		 System.out.println(x);
	}
}
