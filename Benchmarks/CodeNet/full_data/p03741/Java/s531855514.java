import java.io.*;
import java.util.*;

public class C
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine()), ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = Long.parseLong(st.nextToken());
		for(int i = 0; i < n-1; i++)
		{
			long num = Long.parseLong(st.nextToken());
			if(sum > 0)
			{
				sum += num;
				if(sum >= 0)
				{
					ans += sum + 1;
					sum = -1;
				}
			}
			else if(sum < 0)
			{
				sum += num;
				if(sum <= 0)
				{
					ans += -sum + 1;
					sum = 1;
				}
			}
		}
		pw.println(ans);
		br.close();
		pw.close();
		System.exit(0);
	}
}