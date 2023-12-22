import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public  class Main{
     public static void main(String[] args) {
         InputStream inputStream = System.in;
         OutputStream outputStream = System.out;
         InputReader in = new InputReader(inputStream);
         PrintWriter out = new PrintWriter(outputStream);
         TaskA solver = new TaskA();
         solver.solve(1, in, out);
         out.close();

     }

     static class TaskA {
         public void solve(int testNumber, InputReader in, PrintWriter out)
         {
             String s= in.next();
             char c[] =s.toCharArray();
             if(s.length()==2)
                 System.out.println(s);
             else
                 reverseString(c,s.length());

         }
         static  void reverseString(char[] word,int len)
         {

             if(len==0)
                 return;
             System.out.print(word[len-1]);
             word[len-1]='\0';
             reverseString(word,len-1);
         }
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
