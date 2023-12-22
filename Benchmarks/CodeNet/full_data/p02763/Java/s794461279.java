import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        ArrayList<TreeSet<Integer>> map = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            map.add(new TreeSet<Integer>());
        }
        for(int i = 0; i < n; i++){
            map.get(s[i]-'a').add(i);
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
                    }else if(size == 1){
                        int now = map.get(j).last();
                        if(l <= now && now <= r){
                            ans++;
                        }
                    }else if(size == 2){
                        int first = map.get(j).first();
                        int last = map.get(j).last();
                        if(l <= first && first < r || l <= last && last < r){
                            ans++;
                        }
                    }else{
                        ArrayList<Integer> tmp = new ArrayList<Integer>(map.get(j));
                        int left = beamSearch(tmp,l);
                        int right = beamSearch(tmp,r);
                        if(right > left){
                            ans++;
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
    
    public static int beamSearch(ArrayList<Integer> arr, int target){
        int left = 0;
        int right = arr.size();
        while(right-left > 1){
            int mid = (left+right)/2;
            if(arr.get(mid) >= target){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
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
