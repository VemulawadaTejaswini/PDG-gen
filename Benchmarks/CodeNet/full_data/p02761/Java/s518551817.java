import java.util.*;
public class Main
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,m,i,j,k;
		n=s.nextInt();
		if(!(n>=1 && n<=3))
		{
			System.out.println(-1);
			return;
		}
		m=s.nextInt();
		if(!(m>=0 && n<=5))
		{
			System.out.println(-1);
			return;
		}
		int[][] a=new int[m][3];
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			b[i]=0;
		}

		
		for(i=0;i<m;i++)
		{
			j=s.nextInt();
			k=s.nextInt();
			if((j>0 && j<n+1) && (k<10 && k>=0))
			{	a[i][0]=j;
				a[i][1]=k;
				a[i][2]=0;
			}
		}

		for(i=0;i<m;i++)
		{
			if(a[i][0]==1 && a[i][1] ==0)
			{
				System.out.println(-1);
				return;
			}
			else
			{
				if(a[i][2]==-1 && a[i][1] ==b[a[i][0]])
				{
					System.out.println(-1);
						return;
					
				}
				else
				{
						
					b[a[i][0]-1]=a[i][1];
					a[i][2]=-1;

				}
			}
		}
		if(b[0]==0)
		{	System.out.println(-1);
			return;}

		for(i=0;i<n;i++)
		{

			
				System.out.print(b[i]);
			
		}





		
	}
}