class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=0;
		    }
		    int k=sc.nextInt();
		    for(int i=1;i<=k;i++)
		    {
		        int d=sc.nextInt();
		        for(int j=1;j<=d;j++)
		        {
		            int in=sc.nextInt();
		            ar[in-1]++;
		        }
		    }
		    int s=0;
		    for(int i=0;i<n;i++)
		    {
		        if(ar[i]==0)
		        s++;
		    }
		    System.out.println(s);
		} catch(Exception e) {
		}
	}
}
