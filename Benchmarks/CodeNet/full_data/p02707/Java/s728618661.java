import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST;
		int N = Integer.parseInt(BR.readLine()), A; HashMap<Integer, Integer> Counts = new HashMap<>();
		ST = new StringTokenizer(BR.readLine());
		for (int i = 1; i < N; i++)
		{
			A = Integer.parseInt(ST.nextToken());
			if (Counts.containsKey(A)) Counts.put(A, Counts.get(A) + 1);
			else Counts.put(A, 1);
		}
		for (int i = 1; i <= N; i++) System.out.println((Counts.containsKey(i)) ? Counts.get(i) : "0");
	}
}
