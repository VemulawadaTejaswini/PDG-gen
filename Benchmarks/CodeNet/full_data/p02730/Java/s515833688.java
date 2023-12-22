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
		int rb = (n - 1) / 2;
		for(int i = 0; i < rb / 2; ++i)
		{
			if(s.charAt(i) != s.charAt(rb - 1 - i))
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
		int lb = (n + 3) / 2 - 1;
		for(int i = lb; i < n; ++i)
		{
			if(s.charAt(i) != s.charAt(n - 1 - i + lb))
			{
				isStrongPal = false;
				break;
			}
		}
		System.out.println(isStrongPal ? "Yes" : "No");
	}
}
