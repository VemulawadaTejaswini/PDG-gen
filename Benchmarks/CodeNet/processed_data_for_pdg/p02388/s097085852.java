class Main
{
	public static void main (String[] args) throws IOException
	{
		int x;
		String xx; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		xx = br.readLine();
		x = Integer.parseInt(xx);
		System.out.println(x * x * x);
	}
}
