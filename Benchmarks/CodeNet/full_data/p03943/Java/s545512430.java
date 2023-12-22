		Scanner in = new Scanner (System.in);
		int a,b,c ;
		System.out.println("enter candies quantity as: ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a==b+c)
			System.out.println("yes");
		else if (b==a+c)
			System.out.println("yes");
		else if (c==b+a)
			System.out.println("yes");
		else 
			System.out.println("no");
		
		
		
		
	}