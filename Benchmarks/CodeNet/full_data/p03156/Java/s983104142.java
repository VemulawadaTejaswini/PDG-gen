import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//List<Integer> hb=new ArrayList<Integer>();
		//long a=0;
		int af=Integer.MAX_VALUE;
		int bf=Integer.MAX_VALUE;
		int cf=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int [] P=new int[N];
		for(int i=0;i<N;i++)
		{
			P[i]=sc.nextInt();
		}
		//int [][] cost =new int[N-1][2];
		//処理
		//バブルソート
		for(int i=0;i<N-1;i++)
		{
			for(int j=N-1;j>i;j--)
			{
				if(P[j-1]>P[j])
				{
					int tmp=P[j-1];
					P[j-1]=P[j];
					P[j]=tmp;
				}
			}
		}
		//P[0]がA以下でないなら終了
		if(P[0]>A)
		{
			answer=0;
			System.out.println(answer);
			System.exit(0);
		}
		//
		for(int i=0;i<N;i++)
		{
			if(P[i]<=A)
			{
				af=i;
				break;
			}
		}
		for(int i=af;i<N;i++)
		{
			if(P[i]<=B && P[i]>=A+1)
			{
				bf=i;
				break;
			}
		}
		for(int i=bf;i<N;i++)
		{
			if(P[i]>=B+1)
			{
				cf=i;
				break;
			}
		}
		//
		if(af==Integer.MAX_VALUE)
		{
			answer=0;
			System.out.println(answer);
		}
		if(bf==Integer.MAX_VALUE)
		{
			answer=0;
			System.out.println(answer);
		}
		if(cf==Integer.MAX_VALUE)
		{
			answer=0;
			System.out.println(answer);
		}
		//
		int d=bf-af;
		int e=cf-bf+1;
		int f=N-cf;
		int minNum=Integer.MAX_VALUE;
		minNum=Math.min(minNum,d);
		minNum=Math.min(minNum,e);
		minNum=Math.min(minNum,f);
		answer=minNum;
		// 出力
		System.out.println(answer);
	}
}