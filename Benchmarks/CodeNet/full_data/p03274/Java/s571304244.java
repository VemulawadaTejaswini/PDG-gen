
public class Main{
	
	private static int N=(int)Math.pow(10, 5);
	private static int n,k;
	private static long[] a;
	private static long ans=(int)Math.pow(10, 5)*2;
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new long[N+5];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextLong();
		}
	     for(int i=1;i+k-1<=n;i++)
	    {  
	        int l=i,r=i+k-1;
	        ans=Math.min(ans,a[r]-a[l]+Math.min(Math.abs(a[l]),Math.abs(a[r])));
	    }
		System.out.println(ans);
	}

}
