import java.util.*;

public class Code {

	

	static int k;
	static int arr[];
	static int n;
	static int ind;
	static int dp[][];
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
	      n=sc.nextInt();
	      k=sc.nextInt();
	     arr=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=sc.nextInt();
	    	 
	     }
	     
	     dp=new int[1000005][5];
	     
	     int tt=k;
	     int ans=rec(0,tt);
	    
	     if(ans==1)
	     {
	    	 System.out.println("First");
	     }else {
	    	 System.out.println("Second");
	     }
	}
	private static int rec(int chance, int tt) {
		// TODO Auto-generated method stub
		//System.out.println(tt+" "+chance);
		
		if(tt==0)
		{
			return chance==0?2:1;
		}
		int ans=chance== 0 ? 2:1;
		//System.out.println(tt+" "+chance+"  "+dp.length);
		if(dp[tt][chance]!=-1)
		{
			return dp[tt][chance];
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<=tt)
			{
				
				ans=rec(chance^1,tt-arr[i]);
				
			}
			//System.out.println(tt+" "+chance+" "+ans+" "+i);
			if(chance==0&&ans==1)
			{
				dp[tt][chance]=1;
				return 1;
				
			}
			if(chance==1&&ans==2)
			{
				dp[tt][chance]=2;

				return 2;
			}
		}
		dp[tt][chance]=ans;
		return ans;
	}
	
	
	
}
