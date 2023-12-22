import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner("1000 1000 1000 8 ");
		int x, y, z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		long nax[] = new long[x];
		long nay[] = new long[y];
		long naz[] = new long[z];
		int k = sc.nextInt();
		for (int i = 0; i < x; i++)
		{
			nax[i] = sc.nextLong();
		}
		for (int i = 0; i < y; i++)
		{
			nay[i] = sc.nextLong();
		}
		for (int i = 0; i < z; i++)
		{
			naz[i] = sc.nextLong();
		}

		Arrays.parallelSort(nax);
		Arrays.parallelSort(nay);
		Arrays.parallelSort(naz);
		int tmpx = x;
		int tmpy = y;
		int tmpz = z;
		int ox = 0;
		int oy = 0;
		int oz = 0;

		while(tmpx*tmpy*tmpz>64*1024*104) {
			if(nax[ox] > nay[oy] && nax[ox] > naz[oz])
			{
				ox++;
				tmpx--;
			}
			else if(nay[oy] > naz[oz] )
			{
				oy++;
				tmpy--;
			}
			else
			{
				oz++;
				tmpz--;
			}
		}
		long ans[] = new long[tmpx*tmpy*tmpz];
		int l = 0;
		for (int i = ox; i < x; i++)
		{
			for (int j = oy; j < x; j++)
			{
				for (int m = oz; m < x; m++)
				{
					ans[l] = nax[i] + nay[j] + naz[m];
					l++;
				}
			}
		}
		Arrays.parallelSort(ans);
		for  (int i = 0; i < k; i++)
		{
			System.out.println(ans[tmpx*tmpy*tmpz-i-1]);
		}

	}
}