
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k =  in.nextInt();
        List<Long> list = new ArrayList<>(n);
        List<Long> product = new ArrayList<>();
        int m = n;
        while (m >0){
            list.add((in.nextLong()));
            m--;
        }


        for (int i = 0 ; i < n-1; i++){

            for (int j = i+1 ; j <n ; j++){
                product.add(list.get(i) * list.get(j));
            }
        }
        Collections.sort(product);
       
        out.println(Math.abs(product.get(k-1)));

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
        public Long nextLong() {
            return Long.parseLong(next());
        }

    }
}