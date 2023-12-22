

import java.util.HashSet;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < k; i++)
		{
			char c = sc.next().charAt(0);
			set.add(c);
		}
		
		while(true)
		{
			
			String s = Integer.toString(n);
			boolean gud = true;
			for(char c : set)
			{
				int in = s.indexOf(c);
				if(in != -1)
				{
					int or = s.length()-(in+1);
					int mul = 1;
					for(int x = 0; x < or; x++)
						mul*=10;
					n = n + mul;
					n -= n%mul;
					gud = false;
					break;
				}
			}
			if(gud)
			{
				System.out.println(n);
				return;
			}
		}

	}

}
