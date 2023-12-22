import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		String answer="";
		//List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//int h[]=new int[(int)Math.pow(10,5)];
		long warukazu=(long)Math.pow(10,9)+7;
		String b="";
		//入力
		Scanner sc = new Scanner(System.in);
		//int N=sc.nextInt();
		b=sc.next();
		
		//処理
		if(b.equals("A"))
		{
			answer="T";
		}else if(b.equals("T"))
		{
			answer="A";
		}else if(b.equals("C"))
		{
			answer="G";
		}else if(b.equals("G"))
		{
			answer="C";
		}
		
		// 出力
		System.out.println(answer);
	}
}