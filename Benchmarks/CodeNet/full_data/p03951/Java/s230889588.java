

import java.io.*;
import java.util.*;

public class Main{
      static int N=200+10;
      static int MOD=(int)1e9+7;
      static int solve(char[] a,char[] b) {
    	  int n=a.length,m=b.length;
    	  int ans=0;
    	  long ah=0,bh=0,t=1;
    	  for(int i=1;i<=Math.min(n,m);i++) {
    		  ah=(ah+a[n-i]*t)%MOD;
    		  bh=(bh*3+b[i-1])%MOD;
    		  if(ah==bh) ans=i;
    		  t=(t*3)%MOD;
    	  }
    	  return ans;
      }
      
      public static void main(String[] args){
          InputReader in=new InputReader(System.in);
          //Scanner sc=new Scanner(new InputStreamReader(System.in));
          PrintWriter out=new PrintWriter(System.out);
    	  int n=in.nextInt();
          String s1=in.next(),str=in.next();
          int cnt=0;
          out.println(2*n-solve(s1.toCharArray(),str.toCharArray()));
          out.flush();
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
    }
}
