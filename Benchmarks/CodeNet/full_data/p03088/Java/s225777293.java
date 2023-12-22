import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{
	static HashMap<String, Long>[] DP;
	static String Chars = "ACGT";
	
	static boolean isValid(String Last)
	{
		for (int i = 0; i < Last.length(); i++)
		{
			String temp = Last;
			if (i >= 1)
			{
				temp = "";
				for (int j = 0; j < i - 1; j++)
				{
					temp += Last.charAt(j);
				}
				temp += Last.charAt(i) + "" + Last.charAt(i - 1);
				for (int j = i + 1; j < Last.length(); j++)
				{
					temp += Last.charAt(j);
				}
			}
			if (temp.contains("AGC"))
			{
				return false;
			}
		}
		return true;
	}
	
	static long DFS(int N, String Last)
	{
		if (DP[N].containsKey(Last))
		{
			return DP[N].get(Last);
		}
		if (N == 0) return 1;
		DP[N].put(Last, 0l);
		for (int i = 0; i < Chars.length(); i++)
		{
			if (isValid(Last + Chars.charAt(i)))
			{
				long prev = DP[N].get(Last);
				DP[N].put(Last, (prev + DFS(N - 1, Last.substring(1) + Chars.charAt(i))) % ((int)1e9 + 7));
			}
		}
		return DP[N].get(Last);
	}
	
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(BR.readLine()); DP = new HashMap[N + 1];
		for (int i = 0; i <= N; i++)
		{
			DP[i] = new HashMap<>();
		}
		System.out.println(DFS(N, "TTT"));
	}
}
