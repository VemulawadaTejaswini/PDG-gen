/*
* @Author: patan
* @Date:   2019-08-10 17:49:12
* @Last Modified by:   patan
* @Last Modified time: 2019-08-10 19:43:30
*/
import java.io.*;
import java.util.*;
 
public class Main {
	static class Pair{
		public int a,b;
		public Pair(int x,int y)
		{
			a=x;b=y;
		}
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int m = in.nextInt();
		Pair arr[] = new Pair[n];
		int a,b;
		for(int i=0;i<n;i++)
		{
			a=in.nextInt();
			b=in.nextInt();
			arr[i]=new Pair(a,b);
		}
		Arrays.sort(arr,(x,y)->x.a-y.a);
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->y.b-x.b);
		int pos=m-1;
		long ans=0;
		int i=0;
		while(pos>=0)
		{
			if(i<n)
				pos=Math.min(pos,m-arr[i].a);
			if(pos<0)
				break;
			while(i<n)
			{
				if(m-(arr[i].a)<pos)
					break;
				pq.add(arr[i]);
				i++;
			}
			pos--;
			ans+=pq.poll().b;
		}
		out.println(ans);
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