import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] map = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                map[i][j] = sc.nextInt();
            }
        }
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                int pi = i+1;
                int pj = j+1;
                if(map[i][j] % 2 == 0 || i == h-1 && j == w-1){
                    continue;
                }else if(j == w-1){
                    li.add(pi + " " + pj + " " + (pi+1) + " " + pj);
                    map[i+1][j]++;
                }else{
                    li.add(pi + " " + pj + " " + pi + " " + (pj+1));
                    map[i][j+1]++;
                }
            }
        }
        System.out.println(li.size());
        for(String s : li){
            System.out.println(s);
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
