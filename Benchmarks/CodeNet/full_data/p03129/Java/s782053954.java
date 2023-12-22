import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int N=0;
		int K=0;
		int max=0;
		int min=0;
		int sum=0;
		//int sub=0;
		//int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		//X=sc.nextDouble();
		//for(int i=0;i<M;i++)
		//{
		//	X[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		if(N%2==0)
		{
			if(N/2>=K)
			{
				answer="YES";
			}
		}else
		{
			if(N/2+1>=K)
			{
				answer="YES";
			}
		}
		
		// 出力
		//System.out.println(Arrays.toString(X))
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
	}
}