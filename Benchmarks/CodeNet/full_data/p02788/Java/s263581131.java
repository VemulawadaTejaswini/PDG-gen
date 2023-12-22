import java.util.Arrays;
public class Main
{
	
	public static void main(String args[])
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		int n=sc.nextInt();
		int mon[]=new int[n];
		int temp[]=new int[n];
		int count=0;
		int hel[]=new int[n];
		int temp2[]=new int[n];
		int d=sc.nextInt();
		int a=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			mon[i]=sc.nextInt();
			hel[i]=sc.nextInt();
		
		
		}
		
		temp=mon;
		Arrays.sort(mon);
		int j=0;
		
		for(int i=0;i<n;i++)
		{
			if(temp[i]==mon[j])
			{
				temp2[j]=hel[i];
			}
		}
		
		int size=(int)Math.ceil(mon.length/2);
		
		while(!check(hel,n))
		{
			count++;
		for(int i=0;i<size;i++)
		{
			if(hel[i]!=0){
			hel[i]=hel[i]-a;}
		}
		
		for(int i=size;i<n;i++)
		{
			if(hel[i]!=0){
			hel[i]=hel[i]-a;}
		}
		}
		
		System.out.println(count);
	}
	
	static boolean check(int hel[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(hel[i]!=0)
				return false;
			else
				continue;
		}
		return true;
			
			
		}
}
