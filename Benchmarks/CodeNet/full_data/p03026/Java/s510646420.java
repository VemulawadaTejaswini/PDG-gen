import java.util.*;
import java.io.*;
 
public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] nc = new int[n];
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ar.add(new ArrayList<>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            nc[a]++;
            nc[b]++;
            ar.get(a).add(b);
            ar.get(b).add(a);
        }
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < n; i++){
            c.add(sc.nextInt());
        }
        Collections.sort(c,Comparator.reverseOrder());
        int si = getStart(nc,n);
        long total = getTotal(c);
        int[] ans = solve(si,c,ar);
        printArr(total,ans);
    }
    
    private  static int getStart(int[] nc, int n){
        int ret = 0;
        int maxN = 0;
        for(int i = 0; i < n; i++){
            if(maxN < nc[i]){
                maxN = nc[i];
                ret = i;
            }
        }
        return ret;
    }
    
    private static long getTotal(ArrayList<Integer> c){
        long ret = 0;
        int n = c.size();
        for(int i = 1; i < n; i++){
            ret += c.get(i);
        }
        return ret;
    }
    
    private static int[] solve(int si, List<Integer> c, List<ArrayList<Integer>> ar){
        int n = c.size();
        int ci = 0;
        int[] ret = new int[n];
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(si);
        boolean[] arrived = new boolean[n];
        arrived[si] = true;
        long total = 0;
        while(dq.size() > 0){
            int now = dq.poll();
            ret[now] = c.get(ci);
            ci++;
            for(int next : ar.get(now)){
                if(!arrived[next]){
                    arrived[next] = true;
                    dq.add(next);
                }
            }
        }
        return ret;
    }
    
    private static void printArr(long total, int[] ans){
        sb.append(total).append("\n");
        for(int a : ans){
            sb.append(a).append(" ");
        }
        sb.append("\n");
        System.out.print(sb.toString());
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
