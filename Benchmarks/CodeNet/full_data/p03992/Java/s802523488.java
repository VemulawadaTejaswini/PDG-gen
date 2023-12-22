import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.next(); //入力
		
		//空白を挿入する
		StringBuilder sb=new StringBuilder(s);
		sb.insert(4, " ");
		System.out.println(sb);
	}
} 