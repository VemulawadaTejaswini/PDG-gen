import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber , InputReader in , PrintWriter out){
            int h = in.nextInt();
            int w = in.nextInt();
            HashMap<Integer,ArrayList<Integer>> arr = new HashMap<>(h);
            HashMap<Integer,ArrayList<Integer>> arr1 = new HashMap<>(w);
            for (int i = 0; i <h ; i++) {
                arr.put(i , new ArrayList<>());
            }
            for (int i = 0; i <w ; i++) {
                arr1.put(i , new ArrayList<>());
            }
            int[][] count = new int[h][w];
            for (int i = 0; i <h ; i++) {
                String s = in.next();
                for (int j = 0; j <s.length() ; j++) {
                    if (s.charAt(j) == '#')
                    {arr.get(i).add(j);
                        arr1.get(j).add(i);}
                }
            }
            for (int i = 0; i <h ; i++) {
                int k = -1 ;
                int v = 0 ;
                for (int j = 0; j < w ; j++) {
                    if (v>= arr.get(i).size()){
                        arr.get(i).add(w);
                    }
                    if (j == arr.get(i).get(v)){
                        k = arr.get(i).get(v);
                        v++;
                        continue;
                    }
                    count[i][j] = arr.get(i).get(v) -k -1;
                }
            }
            for (int j = 0; j <w ; j++) {
                int k = -1 ;
                int v = 0 ;
                for (int i = 0; i < h ; i++) {
                    if (v >= arr1.get(j).size()){
                        arr1.get(j).add(h); }
                    if (i == arr1.get(j).get(v)){
                        k = arr1.get(j).get(v);
                        v++;
                        continue;
                    }
                    count[i][j]+= arr1.get(j).get(v)-k -1;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <h ; i++) {
                for (int j = 0; j <w ; j++) {
                    max = Math.max(max , count[i][j]);
                }
            }
            out.println(max - 1);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 100000);
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