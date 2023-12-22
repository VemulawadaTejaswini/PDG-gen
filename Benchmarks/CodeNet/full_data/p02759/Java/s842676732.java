import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] first = new int[3][3];
		
		for (int r = 0; r < 3; r++) 
		{
			for (int c = 0; c < 3; c++) 
			{

				first[r][c] = sc.nextInt();
			}
		}
		int a[]= new int[101];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			a[temp]++;
		}
		if(a[first[0][0]]>0 && a[first[0][1]]>0 && a[first[0][2]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[1][0]]>0 && a[first[1][1]]>0 && a[first[1][2]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[2][0]]>0 && a[first[2][1]]>0 && a[first[2][2]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[0][0]]>0 && a[first[1][0]]>0 && a[first[2][0]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[0][1]]>0 && a[first[1][1]]>0 && a[first[2][1]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[0][2]]>0 && a[first[1][2]]>0 && a[first[2][2]]>0)
		{
			System.out.print("Yes");
		}
		else if(a[first[0][0]]>0 && a[first[1][1]]>0 && a[first[2][2]]>0)
		{
			System.out.print("Yes");
		}
		
		else if(a[first[0][2]]>0 && a[first[1][1]]>0 && a[first[2][0]]>0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");

		}
	}
}
