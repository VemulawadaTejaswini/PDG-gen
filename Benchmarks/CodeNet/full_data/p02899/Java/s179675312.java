import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[]args)throws IOException {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		HashMap <Integer, Integer> h = new HashMap<Integer, Integer>();
		int res[] = new int[n];
		for(int i = 1; i <= n; i++)
		{
			h.put(i, S.nextInt());
		}
		for(int i = 1; i <= n; i++)
		{
			res[h.get(i) - 1] = i;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}