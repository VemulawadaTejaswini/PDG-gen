import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int t = b;
		b = a;
		a = t;
		
		t = c;
		c = a;
		a = t;
		
		System.out.println(a + " " + b + " " + c);
		
	}
}
