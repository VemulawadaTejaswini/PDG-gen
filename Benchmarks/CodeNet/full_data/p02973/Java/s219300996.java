import java.util.*;
import java.io.*;
 
public class Main {
    static long[] dist;
    static ArrayList<HashMap<Integer,Long>> root;
    static boolean[] arrived;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        Arrays.fill(arr,Long.MAX_VALUE);
        arr[0] = sc.nextLong();
        int ans = 1;
        for(int i = 1; i < n; i++){
            long tmp = sc.nextLong();
            int index = beamSearch(arr,tmp);
            if(index == 0){
                arr[ans] = tmp;
                Arrays.sort(arr);
                ans++;
            }
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(long[] arr, long chk){
        int left = -1;
        int right = arr.length;
        while(right - left > 1){
            int mid = (left + right) / 2;
            if(arr[mid] < chk){
                left = mid;
            }else{
                right = mid;
            }
        }
        return right;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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