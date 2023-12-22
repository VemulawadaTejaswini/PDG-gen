
	
	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int k=scan.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=scan.nextInt();
				
			}
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n-k+1;i++)
			{
				if(ar[i]>0)
				{
					min=Math.min(min, ar[i+k-1]);
				}else if(ar[i]<0 && ar[i+k-1]<0)
				{
					min=Math.min(min,-ar[i]);
				}else {
					min=Math.min(min,Math.min(-2*ar[i]+ar[i+k-1],2*ar[i+k-1]-ar[i]));
				}
			}
			System.out.println(min);
				
			
		}
	}
