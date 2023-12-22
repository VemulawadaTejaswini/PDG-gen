import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int k=in.nextInt();
		int c=in.nextInt();
		String s = in.next();
		int arr[] = new int[n];
		Arrays.fill(arr,0);
		for(int i=0;i<n;i++)
			if(s.charAt(i)=='o')
				arr[i]=1;
		int left[] = new int[k];
		int right[] = new int[k];
		int pos=0;
		for(int i=0;i<n&&pos<k;i++)
		{
			if(pos==0)
			{
				if(arr[i]==1)
				{
					left[pos++]=i;
				}
			continue;
			}
			int gap = i-left[pos-1]-1;
			if(arr[i]==1 && gap>=c)
			{
				left[pos++]=i;
			}
		}
		pos=0;
		for(int i=n-1;i>=0&&pos<k;i--)
		{
			if(pos==0)
			{
				if(arr[i]==1)
				{
					right[pos++]=i;
				}
			continue;
			}
			int gap = right[pos-1]-i-1;
			if(arr[i]==1 && gap>=c)
			{
				right[pos++]=i;
			}
		}	
		for(int i=0;i<k;i++)
		{
			if(left[i]==right[k-i-1])
			{
				out.println(left[i]+1);
			}
		}
        out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}