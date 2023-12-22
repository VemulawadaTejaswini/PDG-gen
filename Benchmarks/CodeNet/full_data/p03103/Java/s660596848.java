import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner fs = new FastScanner(inputStream);
        PrintWriter pw = new PrintWriter(outputStream);
        long N = fs.nextLong(), M = fs.nextLong();
        long minPrice = 0;
        Map<Long, Long> map = new LinkedHashMap<>();
        List<Long> list = new ArrayList<>();
        for(long i = 0; i < N; i++) {
            map.put(fs.nextLong(), fs.nextLong());
        }
        map = map.entrySet().stream()
                .sorted(Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        map.keySet().stream().forEach(e-> list.add(e));
        for(int i = 0; i < N && M > 0; i++) {
            if(M > map.get(list.get(i))) {
                minPrice += list.get(i) * map.get(list.get(i));
                M -= map.get(list.get(i));
            } else {
                minPrice += list.get(i) * M;
                break;
            }
        }
        pw.println(minPrice);
        pw.close();
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
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }
 
    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = nextLong();
        return a;
    }
 
}
