import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		long answer=0;
		List<Integer> hb=new ArrayList<Integer>();
		List<Integer> h=new ArrayList<Integer>();
		long a=0;
		long b=0;
		long c=0;
		int hi=0;
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			hi=sc.nextInt();
			hb.add(hi);
		}
		for(int i=N;i>0;i--)
		{
			hi=hb.get(i-1);
			h.add(hi);
		}
		
		//処理
		while(sw==false)
		{
			//System.out.println(count);
			if(N==2)
			{
				answer=Math.abs(h.get(0)-h.get(1));
				break;
			}
			if(count>N-2)
			{
				break;
			}else if(count==N-2)
			{
				a=h.get(count);
				b=h.get(count+1);
				answer+=Math.abs(h.get(count)-h.get(count+1));
				break;
			}else
			{
				a=h.get(count);
				b=h.get(count+1);
				c=h.get(count+2);
				if(Math.abs(a-b)>Math.abs(a-c))
				{
					answer+=Math.abs(a-c);
					count+=2;
				}else if(Math.abs(a-b)<Math.abs(a-c))
				{
					answer+=Math.abs(a-b);
					count++;
				}else if(Math.abs(a-b)==Math.abs(a-c))
				{
					answer+=Math.abs(a-c);
					count+=2;
				}
				//System.out.println(answer);
			}
		}
		// 出力
		System.out.println(answer);
	}
}