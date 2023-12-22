import java.util.Scanner;

public class Main 
{
	static double[][] dp; //water sugar
	static boolean[][] done; //water sugar
	static int h,w;
	static double mm = 0;
	
	static long maxwat = 0;
	static long maxsug = 0;
	
	
	static double go(int wat, int sug)
	{
		if(wat*100 + sug > cap)return 0;
		if(wat*e<sug)return 0;
//		System.out.println(wat + " " + sug);
		if(done[wat][sug])return dp[wat][sug];
		double an = 0;
		if(sug>0&&wat*e >= sug)an = sug/wat;
		
		if(an > mm)
		{
			mm = an;
			maxwat = wat;
			maxsug = sug;
		}
		an = Math.max(an, go(wat+bot1, sug));
		an = Math.max(an, go(wat+bot2, sug));
		an = Math.max(an, go(wat, sug+sug1));
		an = Math.max(an, go(wat, sug+sug2));
		done[wat][sug]=true;
		dp[wat][sug]=an;
		return an;
	}
	static int bot1,bot2,sug1,sug2, e, cap;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		bot1 = sc.nextInt();
		bot2 = sc.nextInt();
		
		sug1 = sc.nextInt();
		sug2 = sc.nextInt();
		
		e = sc.nextInt(); //how much sugar can disolve in 1 water
		
		cap = sc.nextInt(); //beaker cap. water is 100x bigger

		h = cap/100;
		w = cap;
		dp = new double[h+1][w];
		done = new boolean[h+1][w];
		
//		System.out.println("HW " + h + " " + w);
		go(0,0);
		System.out.println((maxwat*100)+maxsug + " " + maxsug);
		
		for(int x = 0; x < w; x++)
		{
			for(int y = 0; y < h; y++)
			{
			}
		}
	}

}
