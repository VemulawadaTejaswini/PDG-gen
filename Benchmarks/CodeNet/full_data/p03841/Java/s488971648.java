import java.io.*;
import java.util.*;
public class Main {
    static int[][] canExit;
    static int[][] vis;

    static class Pair{
        int ind, val;
        Pair(int i, int v){
            ind=i;
            val=v;
        }
    }


    static void solve() throws Exception {
        int n = sc.nextInt();
        Pair[] x = new Pair[n];
        for (int i=0;i<n;i++){
            Pair p = new Pair(i, sc.nextInt());
            x[i] = p;
        }
        Arrays.sort(x, (a, b)-> a.val-b.val);
        int[] begin = new int[n+1];
        int[] arr = new int[n*n];
        for (int i=0; i<n; i++){
            int ind = x[i].val-1;
            if (arr[ind]!=0){
                pw.println("No");
                return;
            }
            for (int j=0;j<x[i].ind+1;j++){
                while (arr[ind]!=0){
                    ind = begin[arr[ind]];
                    ind--;
                    if (ind<0){
                        pw.println("No");
                        return;
                    }
                }
                arr[ind] = x[i].ind+1;
                begin[x[i].ind+1] = ind;
            }
        }
        if (arr[0]==0){
            pw.println("No");
            return;
        }
        for (int i=1;i<n*n;i++){
            arr[i]= arr[i]==0?arr[0]:arr[i];
        }
        for (int i=0;i<n*n;i++){
            pw.print(arr[i] + (i!=n*n-1?" ":"\n"));
        }
        pw.println();

    }



    static PrintWriter pw;
    static MScanner sc;

    public static void main(String[] args) throws Exception {

        pw = new PrintWriter(System.out);
        sc = new MScanner(System.in);

        //int tests =sc.nextInt();
        int tests = 1;
        while (tests-- > 0){
            solve();
            pw.flush();
        }

    }

    static class MScanner {
        StringTokenizer st;
        BufferedReader br;

        public MScanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public MScanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int[] intArr(int n) throws IOException {
            int[] in = new int[n];
            for (int i = 0; i < n; i++)
                in[i] = nextInt();
            return in;
        }

        public long[] longArr(int n) throws IOException {
            long[] in = new long[n];
            for (int i = 0; i < n; i++)
                in[i] = nextLong();
            return in;
        }

        public int[] intSortedArr(int n) throws IOException {
            int[] in = new int[n];
            for (int i = 0; i < n; i++)
                in[i] = nextInt();
            shuffle(in);
            Arrays.sort(in);
            return in;
        }

        public long[] longSortedArr(int n) throws IOException {
            long[] in = new long[n];
            for (int i = 0; i < n; i++)
                in[i] = nextLong();
            shuffle(in);
            Arrays.sort(in);
            return in;
        }

        public Integer[] IntegerArr(int n) throws IOException {
            Integer[] in = new Integer[n];
            for (int i = 0; i < n; i++)
                in[i] = nextInt();
            return in;
        }

        public Long[] LongArr(int n) throws IOException {
            Long[] in = new Long[n];
            for (int i = 0; i < n; i++)
                in[i] = nextLong();
            return in;
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }
    }

    static void shuffle(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int idx = (int) (Math.random() * in.length);
            int tmp = in[i];
            in[i] = in[idx];
            in[idx] = tmp;
        }
    }

    static void shuffle(long[] in) {
        for (int i = 0; i < in.length; i++) {
            int idx = (int) (Math.random() * in.length);
            long tmp = in[i];
            in[i] = in[idx];
            in[idx] = tmp;
        }
    }
}
