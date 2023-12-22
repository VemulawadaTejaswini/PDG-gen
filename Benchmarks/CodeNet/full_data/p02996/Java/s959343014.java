import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		Integer [][] a= new Integer [n][2];
		for(int i=0;i<n;i++)
		{
			a[i][1]=in.nextInt();
			a[i][0]=in.nextInt();
		}
		long ans=0;
		int flag=0;
		Arrays.sort(a, new Comparator<Integer[]>() {
	   	@Override  
		public int compare(Integer[] o1, Integer[] o2) {
	            Integer itemIdOne = o1[0];
	            Integer itemIdTwo = o2[0];
		    return itemIdOne.compareTo(itemIdTwo);
		}
	});
		for(int i=0;i<n;i++)
		{
			ans=ans+a[i][1];
			if(ans>a[i][0])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
}
	