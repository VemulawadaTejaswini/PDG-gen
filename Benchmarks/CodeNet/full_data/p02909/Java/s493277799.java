import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		if(s.charAt(0)=='S')
		{
			System.out.println("Cloudy");
		}
		else if(s.charAt(0)=='C')
		{
			System.out.println("Rainy");
		}
		else
		{
			System.out.println("Sunny");
		}
	}
}
	