import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		String answer="No";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int N=0;
		//int X=0;
		int max=0;
		int min=0;
		int sum=0;
		int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		//X=sc.nextDouble();
		int L[]=new int[N];
		for(int i=0;i<N;i++)
		{
			L[i]=sc.nextInt();
		}
		//String S=sc.next();
		
		//処理
		for(int i=0;i<N;i++)
		{
			max=Math.max(max,L[i]);
		}
		for(int i=0;i<N;i++)
		{
			if(count==0 && L[i]==max)
			{
				count++;
			}else
			{
				sum+=L[i];
			}
		}
		if(sum>max)
		{
			answer="Yes";
		}
		// 出力
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
		//System.out.println(max+" "+min);
	}
}