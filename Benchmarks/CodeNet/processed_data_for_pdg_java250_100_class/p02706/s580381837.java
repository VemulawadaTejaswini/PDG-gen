class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner (System.in);
		int ass=0;
		int nod=sc.nextInt();
		int t=sc.nextInt();
		while (t>0)
		{
		    ass=ass+sc.nextInt();
		    t--;
		}
		if(nod>=ass)
		System.out.println(nod-ass);
		else System.out.println(-1);
	}
}
