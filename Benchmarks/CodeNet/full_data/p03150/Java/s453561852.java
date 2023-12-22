import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		String answer="NO";
		int index=-1;
		String nokori="";
		//List<Integer> hb=new ArrayList<Integer>();
		//long a=0;
		//int af=Integer.MAX_VALUE;
		//入力
		Scanner sc = new Scanner(System.in);
		//int a=sc.nextInt();
		String S=sc.next();
		//int [][] cost =new int[N-1][2];
		//処理
		if(S.indexOf("keyence")!=-1)
		{
			answer="YES";
		}else if(S.indexOf("keyenc")!=-1)
		{
			index=S.indexOf("keyenc")+5;
			nokori=S.substring(index);
			if(nokori.indexOf("e")!=-1)
			{
				answer="YES";
			}
		}
		else if(S.indexOf("keyen")!=-1)
		{
			index=S.indexOf("keyen")+4;
			nokori=S.substring(index);
			if(nokori.indexOf("ce")!=-1)
			{
				answer="YES";
			}
		}
		else if(S.indexOf("keye")!=-1)
		{
			index=S.indexOf("keye")+3;
			nokori=S.substring(index);
			if(nokori.indexOf("nce")!=-1)
			{
				answer="YES";
			}
		}
		else if(S.indexOf("key")!=-1)
		{
			index=S.indexOf("key")+2;
			nokori=S.substring(index);
			if(nokori.indexOf("ence")!=-1)
			{
				answer="YES";
			}
		}
		else if(S.indexOf("ke")!=-1)
		{
			index=S.indexOf("ke")+1;
			nokori=S.substring(index);
			if(nokori.indexOf("yence")!=-1)
			{
				answer="YES";
			}
		}
		else if(S.indexOf("k")!=-1)
		{
			index=S.indexOf("k");
			nokori=S.substring(index);
			if(nokori.indexOf("eyence")!=-1)
			{
				answer="YES";
			}
		}
		// 出力
		System.out.println(answer);
	}
}