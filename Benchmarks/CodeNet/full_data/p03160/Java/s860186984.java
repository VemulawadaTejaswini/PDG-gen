import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int []h = new int[n];
		for(int i=0;i<n;i++)
		{
			h[i]=scn.nextInt();
		}
		int []res = new int[n];
		Arrays.fill(res, Integer.MAX_VALUE);
		res[0]=0;
		for(int i=0;i<n;i++)
		{
			for(int j =i+1;j<=i+2&&j<n;j++)
			{
              if(res[i]!=Integer.MAX_VALUE)
				res[j]=Math.min(res[j], Math.abs(h[j]-h[i])+res[i]);
			}
		}
		System.out.println(res[n-1]);
	}
}
