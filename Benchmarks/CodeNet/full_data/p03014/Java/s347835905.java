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
                arr.put(i , new ArrayList<>(h));
            }
            for (int i = 0; i <w ; i++) {
                arr1.put(i , new ArrayList<>(w));
            }
            int[][] count = new int[h][w];
            for (int i = 0; i <h ; i++) {
                String s = in.next();
                for (int j = 0; j <s.length() ; j++) {
                    if (s.charAt(j) == '#')
                    {
                        arr.get(i).add(j);
                        arr1.get(j).add(i);}
                }
            }
            for (int i = 0; i <h ; i++) {
                int k = -1 ;
                int v = 0 ;
                arr.get(i).add(w);
                int val = arr.get(i).get(v);
                for (int j = 0; j < w ; j++) {
                    if (j == val){
                        k = val;
                        v++;
                        continue;
                    }
                    count[i][j] = val-k -1;
                }
            }
            for (int j = 0; j <w ; j++) {
                int k = -1 ;
                int v = 0 ;
                arr1.get(j).add(h);
                int val = arr1.get(j).get(v);
                for (int i = 0; i < h ; i++) {
                    if (i == val){
                        k = val;
                        v++;
                        continue;
                    }
                    count[i][j]+= val-k -1;
                }
            }
            int max =0;
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