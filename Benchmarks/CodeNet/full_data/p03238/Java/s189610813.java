import java.util.*;
import java.io.*;

class Main
{
	public static void main( String[] args )
	{
		Main m = new Main();
		m.A();
	}

	void A()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n == 1) System.out.println("Hello World");
		if(n == 2)
		{
			int a = in.nextInt(), b = in.nextInt();
			System.out.println(a + b);
		}
	}

	// int numWays(int k)
	// {
	// 	if(k < 3) return 1;
		
	// }


	// static int B(String str)
	// {
	// 	int cur = Integer.valueOf(str);
	// 	for(int i = 111; i <= 999; i += 111)
	// 		if(cur <= i) return i;
	// 	return cur;	// should not execute this line
	// }

	// static String update(String str)
	// {
	// 	char[] ch = str.toCharArray();
	// 	for(int i = 0; i < 3; i++)
	// 	{
	// 		if(ch[i] == '1') ch[i] = '9';
	// 		else ch[i] = '1';
	// 	}
	// 	return String.valueOf(ch);
	// }

}