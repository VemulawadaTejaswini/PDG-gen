import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a <= b)
		{
			if(b <= c)
			{
				System.out.println(a+b);
			}
			else
			{
				System.out.println(a+c);
			}
		}
		else
		{
			if(a <= c)
			{
				System.out.println(a+b);
			}
			else
			{
				System.out.println(b+c);
			}
		}

	}

}
