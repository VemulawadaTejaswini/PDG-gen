import java.util.*;
import java.io.*;

class Main
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(B(str));
	}

	static int B(String str)
	{
		int cur = Integer.valueOf(str);
		for(int i = 111; i <= 999; i += 111)
			if(cur <= i) return i;
		return cur;	// should not execute this line
	}

	static String update(String str)
	{
		char[] ch = str.toCharArray();
		for(int i = 0; i < 3; i++)
		{
			if(ch[i] == '1') ch[i] = '9';
			else ch[i] = '1';
		}
		return String.valueOf(ch);
	}

}