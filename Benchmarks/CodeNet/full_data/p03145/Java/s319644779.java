import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		//int count=0;
		//boolean sw=false;
		int answer=0;
		//String answer="NO";
		//List<Integer> hb=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int teihen=0;
		int takasa=0;
		int baburu[]=new int[3];
		//入力
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			baburu[i]=sc.nextInt();
		}
		//int a=sc.nextInt();
		//String S=sc.next();
		//int [][] cost =new int[N-1][2];
		
		//処理
		for(int i=0;i<baburu.length-1;i++)
		{
			for(int j=baburu.length-1;j>i;j--)
			{
				if(baburu[j-1]>baburu[j])
				{
					int tmp=baburu[j-1];
					baburu[j-1]=baburu[j];
					baburu[j]=tmp;
				}
			}
		}
		//System.out.println(Arrays.toString(baburu));
		answer=(baburu[0]*baburu[1])/2;
		// 出力
		System.out.println(answer);
	}
}