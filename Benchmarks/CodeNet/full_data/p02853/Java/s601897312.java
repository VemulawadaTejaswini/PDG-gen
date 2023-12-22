import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{
   /* static class Pair{
        int first,second;
        public  Pair(int x,int y){
            first=x;
            second=y;
        }
    }*/
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        //Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        long sum=0;
        if(x==1)
          sum+=300000;
        else if(x==2)
          sum+=200000;
        else if(x==3)
          sum+=100000;
                if(y==1)
          sum+=300000;
        else if(y==2)
          sum+=200000;
        else if(y==3)
          sum+=100000;
        if(x==y&&x==1)
          sum+=400000;
        out.println(sum);
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
    }
}