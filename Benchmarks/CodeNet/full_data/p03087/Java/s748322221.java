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
		
		int slength=0;
		int sum=0;
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
		slength=S.length();
		//System.out.println(slength);
		String sub[]=new String[slength-1];
		int subCount[]=new int[slength-1];
		for(int i=0;i<slength-2;i++)
		{
			sub[i]=S.substring(i,i+2);
			if(sub[i].equals("AC"))
			{
				subCount[i]=1;
			}else
			{
				subCount[i]=0;
			}
		}
		sub[slength-2]=S.substring(slength-2,slength);
		//System.out.println(Arrays.toString(sub));
		//System.out.println(Arrays.toString(subCount));
		
		for(int i=0;i<Q;i++)
		{
			for(int j=l.get(i)-1;j<r.get(i)-1;j++)
			{
				sum+=subCount[j];
			}
			System.out.println(sum);
			sum=0;
		}
		// 出力
		//System.out.println(answer);
	}
}