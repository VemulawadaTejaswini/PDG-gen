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
		long[] arr = new long[n];
		long[] ori = new long[n];

		for (int i=0; i<n; i++)
		{
			arr[i] = reader.nextLong();
			ori[i] = arr[i];
		}

		Arrays.sort (arr);

		long mid2 = arr[n/2];
		long mid1 = arr[(n-1)/2];

		PrintWriter writer = new PrintWriter (System.out);
		for (int i=0; i<n; i++)
		{
			if (ori[i] <= mid1)
				writer.println (mid2);
			else
				writer.println (mid1);
		}

		writer.close();
	}
}
