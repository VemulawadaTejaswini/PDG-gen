import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String a=in.next();
		char b[]=a.toCharArray();
		if(b[0]==b[1] && b[1]==b[2])
		{
			System.out.println("Yes");
		}
		else if(b[1]==b[2] && b[2]==b[3])
		{
			System.out.println("Yes");
		}
		else System.out.println("No");
		
	}
}