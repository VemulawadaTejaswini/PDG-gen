import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long min=10*9;
		ArrayList<Long> h=new ArrayList<Long>();
		
		//入力
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		int K=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			long hi=sc.nextInt();
			h.add(hi);
		}
		
		//処理
		Collections.sort(h);
		for(int i=0;i<N;i++)
		{
			if(i>N-K)
			{
				break;
			}
			long b=h.get(i+K-1)-h.get(i);
			if(min>b)
			{
				min=b;
			}
		}
		// 出力
		System.out.println(min);
	}
}