import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(abs(x-a) < abs(x-b))
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("B");
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
			return x * (-1);
		}
	}

}
