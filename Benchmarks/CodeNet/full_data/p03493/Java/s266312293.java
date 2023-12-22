import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String[] s = scan.next().split("0");
		scan.close();
		
		int count = 0;
		for(String x : s)
		{
			count++;
		}
		
		System.out.println(count);
	}
}
