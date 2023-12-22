import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner std = new Scanner(System.in);
		int n = std.nextInt();
		int a = std.nextInt();
		int b = std.nextInt();
		int c = 0;
		
		if(n % 2 == 0)
		{
			c = 1 + ((b - a) / 2);
		}
		else
		{
			c = 1 + (b - a) / 2;
		}
		
		System.out.println(c);
	}

}