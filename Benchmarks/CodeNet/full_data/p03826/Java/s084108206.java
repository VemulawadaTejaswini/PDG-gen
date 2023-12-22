	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0;
		Scanner sc = new Scanner(System.in);

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			sc.close();
		}catch(Exception e)
		{
			System.out.println("入力が正しくありません");
			System.exit(1);
		}

		if(!checkNum(a) || !checkNum(a) || !checkNum(a) || !checkNum(a))
		{
			System.out.println("入力が正しくありません");
			System.exit(1);
		}

		if(a*b>c*d)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println(c*d);
		}

//		System.out.println(a + "," + b + "," + c + "," + d);

		System.exit(0);
	}

	private static boolean checkNum(int num)
	{
		if(num < 0 || num > 10000)
		{
			return false;
		}
		return true;
	}