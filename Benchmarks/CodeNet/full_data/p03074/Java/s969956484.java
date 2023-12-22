import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        char[] s = sc.next().toCharArray();
        boolean is0 = s[0] == '0' ? true : false;
        int cnt0 = is0 ? 1: 0;
        li.add(0);
        if(is0){
            li.add(0);
        }
        int now = 1;
        for(int i = 1; i < n; i++){
            if(is0 && s[i] == '0' || !is0 && s[i] == '1'){
                now++;
            }else if(!is0 && s[i] == '0'){
                is0 = true;
                li.add(now);
                now = 1;
                cnt0++;
            }else{
                is0 = false;
                li.add(now);
                now = 1;
            }
        }
        li.add(now);
        int[] arr = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            if(i != 0){
                arr[i] = li.get(i) + arr[i-1];
            }else{
                arr[i] = li.get(i);
            }
        }
        if(cnt0 <= k){
            System.out.println(n);
            return;
        }else{
            int ans = 0;
            for(int i = 0; i < li.size()/2-k; i++){
                ans = Math.max(ans,arr[i*2+k*2+1]-arr[i*2]);
            }
            System.out.println(ans);
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
