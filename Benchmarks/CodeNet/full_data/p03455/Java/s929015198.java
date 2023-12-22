import java.util.Scanner;
public class AtCorder_20190901 {
	public static void main(String[] args)
	{
		//宣言
		Scanner sc = new  Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		String s1 = "Odd";
		String s2 = "Even";
	
		//出力
		if((a + b)%2 ==0 )
		{
			System.out.println(s2);
		}else{
			System.out.println(s1);
		}
	}
}