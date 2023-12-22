import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<ArrayList<Integer>> map;
    static long[] dist;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        dist = new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0] = 0;
        boolean[] arr = new boolean[n];
        arr[0] = true;
        map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            map.get(a).add(b);
            map.get(b).add(a);
        }
        dfs(0,0,arr);
        ArrayList<Integer> red = new ArrayList<Integer>();
        ArrayList<Integer> blue = new ArrayList<Integer>();
        for(int i = 1; i < n; i++){
            if(dist[i] % 2 == 0){
                red.add(i);
            }else{
                blue.add(i);
            }
        }
        int n3 = n/3;
        int[] ans = new int[n];
        StringBuilder sb = new StringBuilder();
        if(red.size() >= n3 && blue.size() >= n3){
            int j = 0;
            for(int i = 1; i <= n; i+=3){
                ans[red.get(j)] = i;
                j++;
                if(j >= red.size()){
                    break;
                }
            }
            j = 0;
            for(int i = 2; i <= n; i+=3){
                ans[blue.get(j)] = i;
                j++;
                if(j >= blue.size()){
                    break;
                }
            }
            int pow3 = 3;
            for(int a : ans){
                if(a == 0){
                    a = pow3;
                    pow3 += 3;
                }
                sb.append(a + " ");
            }
        }else if(red.size() < n3){
            int j = 0;
            for(int i = 3; i <= n; i+=3){
                if(j >= red.size()){
                    break;
                }
                ans[red.get(j)] = i;
                j++;
            }
            int k = 0;
            for(int i = 1; i <= n; i++){
                if(i % 3 == 0 && j*3 > i){
                    continue;
                }
                ans[blue.get(k)] = i;
                k++;
            }
            for(int a : ans){
                sb.append(a + " ");
            }
        }else if(blue.size() < n3){
            int j = 0;
            for(int i = 3; i <= n; i+=3){
                if(j >= blue.size()){
                    break;
                }
                ans[red.get(j)] = i;
                j++;
            }
            int k = 0;
            for(int i = 1; i <= n; i++){
                if(i % 3 == 0 && j*3 > i){
                    continue;
                }
                ans[red.get(k)] = i;
                k++;
            }
            for(int a : ans){
                sb.append(a + " ");
            }
        }
        pw.println(sb.toString().trim());
        pw.flush();
    }
    
    public static void dfs(int s, long dd, boolean[] a){
        for(int b : map.get(s)){
            if(!a[b]){
                dist[b] = dd+1;
                a[b] = true;
                dfs(b,dd+1,a);
                a[b] = false;
            }
        }
        return;
    }
    
}

class Point{
    int x;
    long d;
    public Point(int x, long d){
        this.x = x;
        this.d = d;
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
