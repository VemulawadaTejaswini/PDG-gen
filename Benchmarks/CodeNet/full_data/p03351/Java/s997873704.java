import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		
		if(abs(a-c) <= d)
		{
			System.out.println("Yes");
		}
		else if(abs(a-b) <= d && abs(b-c) <= d)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}
	
	public static int abs(int x)
	{
		if(x >= 0)
		{
			return x;
		}
		else
		{
			return -x;
		}
	}

}
