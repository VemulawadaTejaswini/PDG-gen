class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
		System.out.printf("%d %d %.5f", d, r, f);
	}
}
