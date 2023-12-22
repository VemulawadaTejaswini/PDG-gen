import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length();
		boolean isStrongPal = true;
		for(int i = 0; i < ((n - 1) / 2) / 2; ++i)
		{
			if(s.charAt(i) != s.charAt((n - 1) / 2 - 1 - i))
			{
				isStrongPal = false;
				break;
			}
		}
		if(!isStrongPal)
		{
			System.out.println("No");
			return;
		}
		for(int i = (n + 3) / 2 - 1; i < n; ++i)
		{
			if(s.charAt(i) != s.charAt((n + 3) / 2 - 1 + n - 1 - i))
			{
				isStrongPal = false;
				break;
			}
		}
		System.out.println(isStrongPal ? "Yes" : "No");
	}
}
