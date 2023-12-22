import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 26; i++){
            map.add(new ArrayList<Integer>());
        }
        int i = 0;
        for(char c : s){
            map.get(c-'a').add(i);
            i++;
        }
        long ans = 0;
        int prev = -1;
        for(char c : t){
            ArrayList<Integer> li = map.get(c-'a');
            if(li.size() == 0){
                System.out.println(-1);
                return;
            }
            int index = beamSearch(li,prev);
            if(index == li.size()){
                ans += s.length+li.get(0)-prev;
                prev = li.get(0);
            }else{
                ans += li.get(index)-prev;
                prev = li.get(index);
            }
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(ArrayList<Integer> li, int p){
        int left = -1;
        int right = li.size();
        while(right-left > 1){
            int mid = (right+left)/2;
            if(li.get(mid) <= p){
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
