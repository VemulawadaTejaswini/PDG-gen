class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ab = in.readLine().split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int d = a/b;
		int r = a%b;
		double f = (double)a/(double)b;
		System.out.print(d+" "+r+" ");
		System.out.printf("%.6f\n",f);
	}
}
