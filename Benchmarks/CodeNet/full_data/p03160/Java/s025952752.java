import java.util.Scanner;
import java.lang.Math;
public class Main{
	static int ans = Integer.MAX_VALUE;
	static void fn(int pos,int cost,int[] h, int n){
		if (pos==n-1)
			if (cost<ans)
				ans = cost;
		if ((pos+1)<=(n-1))
			fn(pos+1,cost+Math.abs(h[pos+1]-h[pos]),h,n);
		if ((pos+2)<=(n-1))
			fn(pos+2,cost+Math.abs(h[pos+2]-h[pos]),h,n);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i+=1)
			h[i] = sc.nextInt();
		fn(0,0,h,n);
		System.out.println(ans);
	}
}