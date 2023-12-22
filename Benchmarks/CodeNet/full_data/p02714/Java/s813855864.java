import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(BR.readLine()); String S = BR.readLine(); char I, J; long tripleCount = 0;
		for (int i = 0; i < S.length(); i++)
		{
			I = S.charAt(i);
			for (int j = i + 1; j < S.length(); j++)
			{
				if (S.charAt(j) != I)
				{
					J = S.charAt(j);
					if (S.charAt(j) != I)
					{
						for (int k = j + 1; k < S.length(); k++)
							if (j - i != k - j && S.charAt(k) != J && S.charAt(k) != I) tripleCount++;
					}
				}
			}	
		}	
		System.out.println(tripleCount);
	}
}
