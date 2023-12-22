

import java.util.Scanner;

public class Main
{
	public static int Search(String S)
	{
		int result = 0;
		for(int i = 0; i < S.length() - 1; i++)
			if(S.charAt(i) == S.charAt(i+1))
				result++;
		return result;				

	}

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		in.nextLine();
		String S = in.nextLine();
		
		System.out.println(Math.min((Search(S) + 2 * K), (N - 1)));

	}

}