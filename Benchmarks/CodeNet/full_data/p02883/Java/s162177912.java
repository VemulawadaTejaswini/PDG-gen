import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
 
    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }
 
    static class Task {
 
        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0; i < n; i++) a[i] = scan.nextLong();
            for(int j = 0; j < n; j++) b[j] = scan.nextLong();
            shuffle(a);
            shuffle(b);
            Arrays.sort(a);
            Arrays.sort(b);
            long low = 0, high = (long) (1e15), ans = 0;
            while(low <= high) {
                long mid = (low+high)/2;
                long have = k;
                boolean ok = true;
                for(int i = 0; i < n; i++) {
                    long res = a[i]*b[n-i-1];
                    if(res <= mid) continue;
                    long get = (res - mid)/b[n-i-1];
                    if((res - mid) % b[n-i-1] != 0) get++;
                    if(get <= have) have -= get;
                    else {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    ans = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }
            out.println(ans);
        }
    }
 
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
 
    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
}