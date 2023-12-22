import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = sc.nextIntArray(n);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < (4 << n*2); i++){
            boolean af = false, bf = false, cf = false;
            int ac = 0, bc = 0, cc = 0;
            int con = 0;
            for(int j = 0; j < n; j++){
                if((i >> 2*j) % 4 == 0){
                    continue;
                }else if((i >> 2*j) % 4 == 1){
                    if(!af){
                        af = true;  
                    }else{
                        con++;
                    }
                    ac += arr[j];
                }else if((i >> 2*j) % 4 == 2){
                    if(!bf){
                        bf = true;  
                    }else{
                        con++;
                    }
                    bc += arr[j];
                }else{
                    if(!cf){
                        cf = true;  
                    }else{
                        con++;
                    }
                    cc = arr[j];
                }
            }
            if(af && bf && cf){
                ans = Math.min(ans,Math.abs(a-ac)+Math.abs(b-bc)+Math.abs(c-cc)+con*10);
            }
        }
        System.out.println(ans);
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
