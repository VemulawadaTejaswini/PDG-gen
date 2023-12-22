import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<HashSet<Integer>> map = new ArrayList<>();
        Integer[][] arr = new Integer[26][];
        for(int i = 0; i < 26; i++){
            map.add(new HashSet<Integer>());
        }
        for(int i = 0; i < n; i++){
            map.get(s[i]-'a').add(i);
        }
        for(int i = 0; i < n; i++){
            Integer[] tmp = map.get(i).toArray(new Integer[map.get(i).size()]);
            Arrays.sort(tmp);
            arr[i] = tmp;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int type = sc.nextInt();
            if(type == 1){
                int iq = sc.nextInt()-1;
                char cq = sc.next().charAt(0);
                if(s[iq] == cq){
                    continue;
                }else{
                    map.get(s[iq]-'a').remove(iq);
                    map.get(cq-'a').add(iq);
                    Integer[] tmps = map.get(s[iq]-'a').toArray(new Integer[map.get(s[iq]-'a').size()]);
                    Arrays.sort(tmps);
                    arr[s[iq]-'a'] = tmps;
                    Integer[] tmpc = map.get(cq-'a').toArray(new Integer[map.get(cq-'a').size()]);
                    Arrays.sort(tmpc);
                    arr[cq-'a'] = tmpc;
                    s[iq] = cq;
                }
            }else{
                int ans = 0;
                int l = sc.nextInt()-1;
                int r = sc.nextInt();
                for(int j = 0; j < 26; j++){
                    int size = map.get(j).size();
                    if(size == 0){
                        continue;
                    }
                    int left = ~Arrays.binarySearch(arr[j], l, (x,y)->x.compareTo(y)>=0?1:-1);
                    int right = ~Arrays.binarySearch(arr[j], r, (x,y)->x.compareTo(y)>=0?1:-1);
                    if(right > left){
                        ans++;
                    }
                }
                System.out.println(ans);
            }
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
