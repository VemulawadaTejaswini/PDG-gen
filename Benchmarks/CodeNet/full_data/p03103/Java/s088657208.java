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
import java.util.Collections;
import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner fs = new FastScanner(inputStream);
        PrintWriter pw = new PrintWriter(outputStream);
        int N = fs.nextInt(), M = fs.nextInt();
        Long minPrice = 0L;
        Shop[] shops = new Shop[N];
        for(int i = 0; i < N; i++) shops[i] = new Shop(fs.nextLong(), fs.nextLong());
        Shop.sort(shops);
        for(int i = 0; i < shops.length && M > 0; i++) {
            if(M > shops[i].getAmount()) {
                minPrice += shops[i].getAllPrice();
                M -= shops[i].getAmount();
            } else {
                minPrice += shops[i].getPrice(M);
                break;
            }
        }
        pw.println(minPrice);
        pw.close();
    }

}

class Shop {
    
    private Long price;
    private Long amount;

    Shop() {
        price = 0L;
        amount = 0L;
    }
    
    Shop(Long price, Long amount) {
        this.price = price;
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }
    
    public Long getPrice(int amount) {
        return price * amount;
    }
    
    public Long getAmount() {
        return amount;
    }
    
    public Long getAllPrice() {
        return price * amount;
    }
    
    public static Shop[] sort(Shop[] shops) {
        Arrays.sort(shops, Comparator.comparing(Shop::getPrice));
        return shops;
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
