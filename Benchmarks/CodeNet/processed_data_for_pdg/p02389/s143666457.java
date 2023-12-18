class Main{
	public static void main(String[] args) throws Exception {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] str = x.split(" "); 
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
		System.out.println(a*b + " " + 2*(a+b));
	}
}
