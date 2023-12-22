import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		boolean sw2=false;
		boolean sw3=false;
		int answer=0;
		//String answer="Heisei";
		//List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int h=sc.nextInt();
		int w=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[N];
		//List<Integer> l=new ArrayList<Integer>();
		//List<Integer> w=new ArrayList<Integer>();
		//for(int i=0;i<N;i++)
		//{
		//	l.add(sc.nextInt());
		//}
		//String S=sc.next();
		
		//処理
		if(H==h)
		{
			if(W==w)
			{
				answer=0;
			}
		}
		int a=H*W;
		int b=(h*W)+(w*H)-(h*w);
		answer=a-b;
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}