class Main
{
	public static void main (String[] args) throws IOException
	{
		String X;
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		X = br.readLine();
		x = Integer.parseInt(X);
		System.out.println((int)Math.pow(x,3));
	}
}
