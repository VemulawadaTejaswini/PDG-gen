import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long answer=0;
		int hi=0;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] h=new int[N];
		int[] cost=new int[N];
		for(int i=0;i<N;i++)
		{
			hi=sc.nextInt();
			h[i]=hi;
		}
		//処理
		cost[0]=0;
		cost[1]=Math.abs(h[0]-h[1]);
		for(int i=2;i<N;i++)
		{
			cost[i]=Math.min(Math.abs(h[i-2]-h[i])+cost[i-2],Math.abs(h[i-1]-h[i])+cost[i-1]);
		}
		answer=cost[N-1];
		// 出力
		System.out.println(answer);
	}
}