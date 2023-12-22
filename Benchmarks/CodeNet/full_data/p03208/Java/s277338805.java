import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int min=10*9+1;
		//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K=sc.nextInt();
		ArrayList<int> h=new ArrayList<int>();
		for(int i=0;i<N;i++)
		{
			int hi=sc.nextInt();
			h.add(hi);
		}
		//処理
		Collections.sort(h);
		//System.out.println(Arrays.toString(h));
		for(int i=0;i<m;i++)
		{
			if(i>N-K)
			{
				break;
			}else
			{
				int b=c.get(i+K-1)-c.get(i);
				if(min>b)
				{
					min=b;
				}
			}
		}
		// 出力
		//System.out.println(Arrays.toString(h));
		System.out.println(min);
	}
}