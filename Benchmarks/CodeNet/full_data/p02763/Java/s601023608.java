import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<BIT> arr = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            arr.add(new BIT(n+10));
        }
        for(int i = 0; i < n; i++){
            arr.get(s[i]-'a').add(i+1,1);
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int type = sc.nextInt();
            if (type == 1) {
                int index = sc.nextInt()-1;
                char nc = sc.next().charAt(0);
                char pc = s[index];
                s[index] = nc;
                arr.get(pc-'a').add(index+1, -1);
                arr.get(nc-'a').add(index+1, 1);
            }
            else {
                int l = sc.nextInt()-1;
                int r = sc.nextInt();
                int res = 0;
                for(int j = 0; j < 26; j++){
                    if(arr.get(j).sum(l+1,r+1) > 0){
                        res++;
                    }
                }
                System.out.println(res);
            }
        }
    }
}


class BIT{
    int uSum = 0;
    int[] dat;
    
    public BIT(int n){
        this.dat = new int[n+1];
        this.uSum = n;
    }
    
    public void add(int a, int x){
        for (int i = a; i < dat.length; i += i & -i){
            dat[i] = dat[i] + x;
        }
        return;
    }
    
    public int sum(int a){
        int res = uSum;
        for (int i = a; i > 0; i -= i & -i)
            res = res + dat[i];
        return res;
    }
    
    public int sum(int a, int b) {
        return sum(b - 1) - sum(a - 1);
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
