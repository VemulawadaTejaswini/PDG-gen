package vaccation;

import java.util.Scanner;

public class paths {


	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int n=100;
		int m=100;
		int ar[][]=new int[n][m];
		for(int i=0;i<n/2;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<m;j++) {
					ar[i][j]=1;
				}
				
			}else {
				for(int j=0;j<m;j++)
				{
					if(j%2==0||b==0)
					{
						ar[i][j]=1;
					}else {
						ar[i][j]=0;
						b--;
					}
				}
			}
		}
		for(int i=(n/2);i<n;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<m;j++) {
					ar[i][j]=0;
				}
				
			}else {
				for(int j=0;j<m;j++)
				{
					if(j%2==0||a==0)
					{
						ar[i][j]=0;
					}else {
						ar[i][j]=1;
						a--;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(ar[i][j]==1) {
					System.out.print("#");
				}else {
					System.out.print(".");
				}
//				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
	}
}
