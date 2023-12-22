import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        ArrayList<Long> c = new ArrayList<>();
        for(int i = 0; i < x; i++){
            a.add(sc.nextLong());
        }
        for(int i = 0; i < y; i++){
            b.add(sc.nextLong());
        }
        for(int i = 0; i < z; i++){
            c.add(sc.nextLong());
        }
        Collections.sort(a,Comparator.reverseOrder());
        Collections.sort(b,Comparator.reverseOrder());
        Collections.sort(c,Comparator.reverseOrder());
        ArrayList<Long> arr = new ArrayList<>();
        ArrayList<Long> tmp = new ArrayList<>();
        for(int i = 0; i < y; i++){
            for(int j = 0; j < z; j++){
                tmp.add(b.get(i)+c.get(j));
            }
        }
        Collections.sort(tmp,Comparator.reverseOrder());
        int imax = Math.min(x,k);
        int jmax = Math.min(y*z,k);
        for(int i = 0; i < imax; i++){
            for(int j = 0; j < jmax; j++){
                arr.add(a.get(i) + tmp.get(j));
            }
        }
        Collections.sort(arr,Comparator.reverseOrder());
        for(int i = 0; i < k; i++){
            pw.println(arr.get(i));
        }
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
