import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double minx = 0;
		double miny = 0;
		double maxx = 0;
		double maxy = 0;
		double[] ax = new double[n];
		double[] ay = new double[n];
		for(int i = 0; i < n; i++)
		{
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			ax[i]=x;
			ay[i]=y;
			if(i == 0)
			{
				minx = x;
				miny = y;
				maxx = x;
				maxy = y;
			}
			else
			{
				minx = Math.min(minx, x);
				miny = Math.min(miny, y);
				maxx = Math.max(maxx, x);
				maxy = Math.max(maxy, y);
			}
		}
		
		double x = ((double)maxx + (double)minx)/2;
		double y = ((double)maxy + (double)miny)/2;
		double d = 0;
		for(int i = 0; i < n; i++)
		{
			double dif = Math.sqrt((x-ax[i])*(x-ax[i]) + (y-ay[i])*(y-ay[i]));
			d = Math.max(dif, d);
		}
		System.out.println(d);
	}

}
