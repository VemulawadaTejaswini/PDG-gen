import java.util.*;
import java.io.*;

class Main
{
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

	public static void main (String[] args)
	{
		FastReader reader = new FastReader();
		int n = reader.nextInt();
		String input = reader.nextLine();

		int[] east = new int[n+2];
		int[] west = new int[n+2];

		for (int i=1; i<=n; i++)
		{
			east[i] = east[i-1];
			west[i] = west[i-1];

			if (input.charAt(i-1) == 'E')
				east[i]++;
			else
				west[i]++;
		}

		east[n+1] = east[n];
		west[n+1] = west[n];

		int ans = Integer.MAX_VALUE;
		for (int i=1; i<=n; i++)
			ans = Math.min (ans, west[i-1] + east[n+1] - east[i]);

		System.out.println (ans);

	}
}
