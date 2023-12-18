class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int num = Integer.parseInt(str1);
		num = num * num * num;
		System.out.println(num);
	}
}
