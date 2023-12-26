class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int sum=0;
		    for(int i=0;i<m;i++)
		    {
		        sum+=sc.nextInt();
		    }
		    n=n-sum;
		    if(n<0)
		    System.out.println(-1);
		    else
		    System.out.println(n);
		} catch(Exception e) {
		}
	}
}
