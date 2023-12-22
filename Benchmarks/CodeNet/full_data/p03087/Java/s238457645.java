import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		int N=0;
		String S="";
		int Q=0;
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> r=new ArrayList<Integer>();
		
		String s="";
		String sub="";
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		Q=sc.nextInt();
		S=sc.next();
		for(int i=0;i<Q;i++)
		{
			l.add(sc.nextInt());
			r.add(sc.nextInt());
		}
		//System.out.println(Arrays.toString(l.toArray()));
		//System.out.println(Arrays.toString(r.toArray()));
		//処理
		for(int i=0;i<Q;i++)
		{
			count=0;
			s=S.substring(l.get(i)-1,r.get(i));
			
			for(int j=0;j<s.length()-1;j++)
			{
				sub=s.substring(j,j+2);
				if(sub.equals("AC"))
				{
					count++;
				}
			}
			answer=count;
			System.out.println(answer);
		}
		// 出力
		//System.out.println(answer);
	}
}