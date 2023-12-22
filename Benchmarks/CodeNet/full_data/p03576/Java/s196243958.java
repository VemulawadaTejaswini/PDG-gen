import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] a = new int[4];
		long[] x = new long[n];
		long[] y = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int[] b = new int[4];
		long best = 8999999999999999999l;
		
		for(a[0] = 0; a[0] < n; a[0]++)
			for(a[1] = a[0]; a[1] < n; a[1]++)
				for(a[2] = a[1]; a[2] < n; a[2]++)
					for(a[3] = a[2]; a[3] < n; a[3]++)
					{
						long y0 = 2000000000;
						long y1 = -2000000000;
						long x0 = 2000000000;
						long x1 = -2000000000;
						for(int i = 0; i < 4; i++)
						{
							x0=Math.min(x0, x[a[i]]);
							x1=Math.max(x1, x[a[i]]);
							y0=Math.min(y0, y[a[i]]);
							y1=Math.max(y1, y[a[i]]);
						}
						int c = 0;
						for(int i = 0; i < n; i++)
						{
							if(x[i]>=x0&&x[i]<=x1&&y[i]>=y0&&y[i]<=y1)
								c++;
						}
						long area = (x1-x0)*(y1-y0);
						if(c>=k&&area<best)
						{
							for(int i = 0; i < 4; i++)
								b[i] = a[i];
							best = area;
						}
					}
			
		System.out.println(best);
	}

}
