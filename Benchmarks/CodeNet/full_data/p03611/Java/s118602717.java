
import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int[] freq = new int[(int)1e5 + 5];
		int N = sc.nextInt();
		for (int i = 0; i < N; i++)
		{
			int number = sc.nextInt(); number++;
			freq[number]++;
			freq[number - 1]++;
			freq[number + 1]++;
		}
		int best = 0;
		for (int i = 0; i < freq.length; i++)
		{
			best = Math.max(freq[i], best);
		}
		System.out.println(best);
	}
}
