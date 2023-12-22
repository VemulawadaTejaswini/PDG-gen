import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		
		int[] posx = new int[w*h];
		int[] posy = new int[w*h];
		for(int y = 0; y < h; y++)
		{
			for(int x = 0; x < w; x++)
			{
				int cur = sc.nextInt()-1;
				posx[cur] = x;
				posy[cur] = y;
			}
		}
		
		for(int i = w*h-1; i>=0;i--)
		{
			
		}
		
//		long[][] sumdis = new long[d][((h*w)/d)+1];
		long[] sumdis = new long[h*w];
		for(int offset = 0; offset < d; offset++)
		{
			long curdis = 0;
			for(int x = offset+d; x < h*w; x += d)
			{ //distance to here from 0!!!
				int disx = posx[x] - posx[x-d];
				if(disx<0)disx*=-1;
				int disy = posy[x] - posy[x-d];
				if(disy<0)disy*=-1;
				
				curdis += disx + disy;
				sumdis[x] = curdis;
			}
		}
		
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < q; i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			long an = sumdis[r] - sumdis[l];
			sb.append(an + "\n");
		}
		System.out.print(sb);
	}

}
