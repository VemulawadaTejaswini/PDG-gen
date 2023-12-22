import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		
		if(a < 1 || a > 9)
		{
			System.out.println("-1");
          	return ;
		}
		
		if(b < 1 || b > 9)
		{
			System.out.println("-1");
          	return ;
		}
		
		System.out.println(a * b);
		

	}

}
