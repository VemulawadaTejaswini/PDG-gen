import java.util.Scanner;

public class Main {
	int n;//人数
	int m;//スポーツ数
	int[][] a = new int [301][301];
	int max;
	boolean [] held = new boolean[301];
	int [] count = new int [301];
	public static void main(String[] args) {
		Main mm = new Main();
		int k = 0;
		mm.imput();
		while(k<mm.m) {
			mm.join();
			mm.maxCheck();
			k++;
		}
		System.out.println(mm.max);
	}

	public void imput()
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int i = 1;i<=n;i++)
		{
			for (int j = 1;j<=m ;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}

		max = m;
		for (int i = 1;i<=m;i++)
		{
			held[i]=true;
		}
	}

	public void join()
	{
		for(int i=1;i<=m;i++)
		{
			count[i] = 0;
		}
		for (int i = 1;i<=n;i++)
		{
			for (int j=1;j<=m;j++)
			{
				if(held[a[i][j]])
				{
					count[a[i][j]] +=1;
					break;
				}
			}

		}
	}

	public void maxCheck()
	{
		int maxi = 0;
		for (int i = 1;i<=m;i++)
		{
			if (count[i]>maxi)
			{
				maxi = count[i];
			}
		}

		if (maxi<max)
		{
			max = maxi;
		}
		for (int i=0;i<m;i++)
		{
			if(count[i+1] == maxi)
			{
				held[i+1] = false;
			}
		}
	}



}