import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		String answer="";
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		//入力
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		//List<Integer> A=new ArrayList<Integer>();
		//Arrays.sort(a,(x,y) -> Long.compare(x[0], y[0]));
		//処理
		if(A==B && B==C && C==A)
		{
			answer="Yes";
		}else
		{
			answer="No";
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}