import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int arr[][] = new int[n][d];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<d;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int count=0;
		double dist = 0;
		for(int i=0;i<n-1;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				for(int k = 0;k<d;k++)
				{
					dist += (double)(Math.pow(arr[i][k]- arr[j][k],2));
				}
				dist = (double)Math.sqrt(dist);
				//System.out.println(dist);
				double ans = Math.ceil(dist);
				
				if(ans == dist)
					count++;
				dist=0;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
