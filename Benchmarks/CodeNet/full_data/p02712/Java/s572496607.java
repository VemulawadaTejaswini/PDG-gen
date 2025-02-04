import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        Long Sum = 0L;

        for (int i = 0; i < N; i++) {
            if (i%5==0)
                continue;
            else if(i%3 == 0)
                continue;
            else {
                Sum+=i;
            }
        }
        System.out.println(Sum);

    }

    public static int MaxTwo(int x, int y){
        return ((x > y)?x:y);
    }
    public static int MaxThree(int x, int y, int z){
        return MaxTwo(MaxTwo(x,y),z);
    }
    public static int MinTwo(int x, int y){
        return ((x < y)?x:y);
    }
    public static int MinThree(int x, int y, int z){
        return MinTwo(MinTwo(x,y),z);
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

        public int[] nextIntArray(int size){
            int arr[] =new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(next());
//                sum = sum + in.nextInt();
            }
            return arr;
        }

    }
}


