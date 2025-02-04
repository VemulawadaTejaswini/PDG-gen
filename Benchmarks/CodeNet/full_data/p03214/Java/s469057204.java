import java.io.*;
import java.util.StringTokenizer;

class Main{

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Twinkle little = new Twinkle();
        little.star(1, in, out);
        out.close();


    }
static class Twinkle {
        public void star(int testNumber, InputReader in, PrintWriter out) {
            int test = in.nextInt();
            double temp = test;
            double sum =0;
            double max=0;
            double array []= new double[test];
            for(int i =0;i<test;i++)
            {
                array[i]= in.nextInt();
                if(max<array[i])
                    max=array[i];
                sum+=array[i];

            }
            double avg = sum/temp;
            //System.out.println(avg);
            int store =0;
            for(int i =0;i<temp;i++)
            {
                if(avg==array[i])
                {
                    store+=i;
                    break;
                }
            }
            System.out.println(store);


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
      public   String nextLine()
        {
            String str = "";
            try
            {
                str = reader.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    String line = reader.readLine();
                    if (line == null) {
                        return false;
                    }
                    tokenizer = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }
    }
}
