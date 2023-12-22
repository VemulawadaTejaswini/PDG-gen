import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int   length = sc.nextInt();
		
		String a = sc.next();
		String b = sc.next();
		
		sc.close();
		
		String c = new String("");
		
		for(int i=0; i< length; i++)
		{
			c += a.charAt(i);
			c += b.charAt(i);
		}
		
		System.out.println(c);
	}
}
