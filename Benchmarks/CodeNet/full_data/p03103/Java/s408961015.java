import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		boolean sw2=false;
		long answer=0;
		//List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int amountNum=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		//List<Integer> A=new ArrayList<Integer>();
		//for(int i=0;i<M;i++)
		//{
		//	A.add(sc.nextInt());
		//}
		int d[][]=new int[N][2];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<2;j++)
			{
				d[i][j]=sc.nextInt();
			}
		}
		//処理
		while(sw==false)
		{
			for(int i=0;i<N;i++)
			{
				min=Math.min(min,d[i][0]);
			}
			for(int i=0;i<N;i++)
			{
				if(min==d[i][0])
				{
					max=Math.max(max,d[i][1]);
					amountNum=i;
				}
			}
			for(int i=0;i<d[amountNum][1];i++)
			{
				if(count==M)
				{
					break;
				}else
				{
					if(max==0)
					{
						break;
					}else
					{
						answer+=min;
						max--;
						count++;
					}
				}
			}
			d[amountNum][0]=Integer.MAX_VALUE;
			d[amountNum][1]=Integer.MIN_VALUE;
			amountNum=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
			if(count==M)
			{
				sw=true;
			}
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		//System.out.println("-------------------");
		System.out.println(answer);
	}
}