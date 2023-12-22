import java.io.*;
import java.util.*;

public class B
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int n = str.length();
		char[] s = new char[n + 1];
		for(int i = 1; i <= n; ++i)
			s[i] = str.charAt(i - 1);
		boolean isStrongPal = true;
		int rb = (n - 1) / 2;
		for(int i = 1; i <= rb; ++i)
		{
			if(s[i] != s[rb + 1 - i])
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
		int lb = (n + 3) / 2;
		for(int i = lb; i <= n; ++i)
		{
			if(s[i] != s[n - i + lb])
			{
				isStrongPal = false;
				break;
			}
		}
		System.out.println(isStrongPal ? "Yes" : "No");
	}
}
