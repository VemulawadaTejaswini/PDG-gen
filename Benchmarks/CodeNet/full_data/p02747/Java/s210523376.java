
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String str =  in.next();
        char[] ch = str.toCharArray();
        boolean flag = false;

        while (str.length() >0 ){
            if (str.length() == 1) {
                flag =false;
                break;
            }if ("hi".equals(str.substring(0,2))){
                flag = true;
                str = str.substring(2,str.length());
                System.out.println(str);
            }else
            {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("yes");
        else
            System.out.println("no");

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
