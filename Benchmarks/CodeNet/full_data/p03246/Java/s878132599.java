import java.util.Arrays;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] score = new int[2][100001];
		int[][] maxs = new int[2][2];
		int[][] maxer = new int[2][2];
		int[] has = new int[2];
		
		for(int i = 0; i < n; i++)
		{
			int m = i%2;
			int a = sc.nextInt();
			if(score[m][a] == 0)has[m]++;
			score[m][a]++;
		}
		
		for(int i = 1; i <= 100000; i++)
		{
			for(int m = 0; m < 2; m++)
			{
				if(score[m][i] > maxs[m][0])
				{
					maxs[m][1] = maxs[m][0];
					maxer[m][1] = maxer[m][0];
					
					maxs[m][0] = score[m][i];
					maxer[m][0] = i;
				}
				else if(score[m][i] > maxs[m][1])
				{
					maxs[m][1] = score[m][i];
					maxer[m][1] = i;
				}
			}
		}
		
		int an = -1;
		if(maxer[0][0] != maxer[1][0])
		{
			an = n - maxs[0][0] - maxs[1][0];
		}
		else if(has[0] >= 2 && has[1] >= 2)
		{
			an = n - maxs[0][0] - maxs[1][1];
			an = Math.min(an, n - maxs[0][1] - maxs[1][0]);
		}
		else if(has[0] == 1 && has[1] >= 2)
		{
			an = n - maxs[0][0] - maxs[1][1];
		}
		else if(has[0] >= 2 && has[1] == 1)
			an = n - maxs[0][1] - maxs[1][0];
		else if(has[0] == 1 && has[1] == 1)
		{
			an = n/2;
		}
		System.out.println(an);

	}

}
