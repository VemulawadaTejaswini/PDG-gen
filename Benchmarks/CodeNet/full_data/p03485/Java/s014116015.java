import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = (a+b);
		if(sum%2!=0)
		System.out.println((sum-(sum%2)+2)/2);
		else
		System.out.println((sum-(sum%2))/2);
	}
}