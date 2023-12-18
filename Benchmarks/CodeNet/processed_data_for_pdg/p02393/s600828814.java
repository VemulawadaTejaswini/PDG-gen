class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
                if(a < b && b < c)
		{
			System.out.println(a + " " + b + " " + c);	
		}
		if(a > b && b > c)
		{
			System.out.println(c + " " + b + " " + a);
		}
		if(a > b && b == c)
		{
			System.out.println(b + " " + c + " " + a);
		}
		if(a > b && b < c)
		{	
			if(a < c)
			{
				System.out.println(b + " " + a + " " + c);
			}
			if(c < a)
			{
				System.out.println(b + " " + c + " " + a);
			}
			if(a == c)
			{
				System.out.println(b + " " + a + " " + c);
			}
		}
		if(a < b && b > c)
		{
			if(a < c)
			{ 
				System.out.println(a + " " + c + " " + b);
			}
			if(c < a)
			{
				System.out.println(c + " " + a + " " + b);
			}
			if(a == c)
			{ 
				System.out.println(a + " " + c + " " + b);
			}
		}
	}
}
