

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int x=scan.nextInt();
		int y=scan.nextInt();
		int gg=Math.min(x, y);
		int cost=0;
		cost=Math.min((a*gg+b*gg),gg*c*2);
		
		if(x>=y)
		{
		 int xneed=x-gg;	
		 cost+=Math.min(a*xneed,2*c*xneed);
		}else {
			int need=y-gg;
			cost+=Math.min(a*need,2*c*need);
		}
		System.out.println(cost);
	}
}
