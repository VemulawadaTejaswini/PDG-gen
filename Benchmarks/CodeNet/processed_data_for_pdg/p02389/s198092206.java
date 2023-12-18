class Main{
    public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		try{	
			int a = sc.nextInt();
			int b = sc.nextInt();
    		System.out.printf("%d %d\n", a*b, 2*(a+b) );
		}
		catch(Exception e){}
    }
}
