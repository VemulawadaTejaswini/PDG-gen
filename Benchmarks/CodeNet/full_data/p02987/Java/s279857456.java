/*
* @Author: patan
* @Date:   2019-06-29 17:35:14
* @Last Modified by:   patan
* @Last Modified time: 2019-06-29 17:42:59
*/
import java.io.*;
import java.util.*;
 
public class a {

	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		String s = in.next();
		int alpha[] = new int[26];
		Arrays.fill(alpha,0);
		for(char c : s.toCharArray())
		{
			alpha[c-'A']++;
		}
		int count = 0;
		for(int i=0;i<26;i++)
		{
			if(alpha[i]==2)
				count++;
		}
		if(count==2)
			out.println("Yes");
		else
			out.println("No");
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