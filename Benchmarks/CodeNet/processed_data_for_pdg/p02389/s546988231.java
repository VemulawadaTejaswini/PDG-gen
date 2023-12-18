class Main
{
	static Scanner sc;
	public static void main( String[] args ) throws IOException
	{
		sc = new Scanner( new BufferedReader( new InputStreamReader( System.in ) ) );
	    int a = sc.nextInt(), b = sc.nextInt();
	    System.out.printf("%d %d\n", a * b, a + a + b + b);
	}
}
