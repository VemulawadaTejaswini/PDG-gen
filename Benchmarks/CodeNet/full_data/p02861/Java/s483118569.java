import java.util.*;
import java.lang.Math;
public class Main{
	public static int fact(int a) {
		int ret=1;
		for(int i=1;i<=a;++i)
			ret*=i;
		return ret;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] ar=new int[n][2];
		
		for(int i=0;i<n;++i)
		{
			ar[i][0]=sc.nextInt();
			ar[i][1]=sc.nextInt();
		}
		double dist=0;
		for(int i=0;i<n;++i) {
			for(int j=i;j<n;++j) {
				dist+=Math.sqrt((ar[i][0]-ar[j][0])*(ar[i][0]-ar[j][0])+(ar[i][1]-ar[j][1])*(ar[i][1]-ar[j][1]));
			}
		}
		System.out.println(dist*2.0/n);
	}
}