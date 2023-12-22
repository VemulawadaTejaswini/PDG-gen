
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=sc.nextInt();
		int x,y,z,i,j,m;
		int ans=0;
		for(i=0;i<=k;i++)
		{
			for(j=0;j<=k;j++)
			{
				for(m=0;m<=k;m++)
				{
					if(j+i+m==s) ans++;
				}
			}
			
		}
		System.out.println(ans);
	}
}
