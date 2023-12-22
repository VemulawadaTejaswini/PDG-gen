import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next(); //入力された文字列
		String test="CODEFESTIVAL2016";
		int num=0;	//書き換えるかい回数
		
		//1文字ずつ一致しているか確認
		for(int i=0;i<s.length();i++)
		{
			char s_c=s.charAt(i);
			if(!(s_c==test.charAt(i))) num++;
		}

		//一致していない回数(=書き換える回数)を出力
		System.out.println(num);
	}
} 