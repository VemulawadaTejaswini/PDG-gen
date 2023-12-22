import java.util.*;
import java.io.*;

public class Main {
    static long[][] exp;
    static char[] s;
    static long[] MOD = {(int) 1e9+7, (int) 1e9+9, (int) 1e9+23};
    static long base = 27;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        s = scanner.next().toCharArray();
        int hi = n/2;
        int lo = 1;
        exp = new long[s.length+1][MOD.length];
        for(int i = 0; i <= s.length; i++) {
            for(int j = 0; j < MOD.length; j++) {
                if(i == 0) exp[i][j] = 1;
                else exp[i][j] = mult(exp[i-1][j], base, MOD[j]);
            }
        }
        while(hi >= lo) {
            int mid = (hi + lo)/2;
            if (check(mid, s, n)) lo = mid + 1;
            else hi = mid-1;
        }
        out.println(lo-1);
        out.flush();
    }
    static RollingHash getCopy(RollingHash a) {
        RollingHash res = new RollingHash();
        res.size = a.size;
        for(int i = 0; i < a.value.length; i++) {
            res.value[i] = a.value[i];
        }
        return res;
    }
    static boolean check(int mid, char[] s, int n) {
        ArrayList<RollingHash> a = new ArrayList<>();
        HashMap<RollingHash, Integer> check = new HashMap<>();
        RollingHash curr = new RollingHash();
    
        for(int i = 0; i < mid; i++) curr.addLast(s[i]-'a'+1);
        a.add(getCopy(curr));
        for(int i = mid; i < n; i++) {
            curr.pollFirst();
            curr.addLast(s[i]-'a'+1);
            a.add(getCopy(curr));
        }
    
        for(int i = mid; i < a.size(); i++) {
            check.put(a.get(i), check.getOrDefault(a.get(i), 0) + 1);
        }
        for(int i = 0; i < a.size(); i++) {
            if(check.containsKey(a.get(i))) {
                return true;
            }
            if(check.isEmpty()) break;
            RollingHash toRemove = a.get(i+mid);
            int count = check.get(toRemove);
            if(count == 1) check.remove(toRemove);
            else check.put(toRemove, count-1);
        }
        return false;
    }
    static long mult(long a, long b, long mod) {
        return ((a%mod)*(b%mod))%mod;
    }
    static long add(long a, long b, long mod) {
        return (a%mod+b%mod)%mod;
    }
    static long sub(long a, long b, long mod) {
        return (a%mod - b%mod + mod)%mod;
    }
    
    static class RollingHash {
        int size = 0;
        long[] value = new long[MOD.length];
        ArrayDeque<Integer> check = new ArrayDeque<>();
        
        public void addFirst(int v) {
            for(int i = 0; i < value.length; i++) {
                value[i] = add(value[i], mult(v, exp[size][i], MOD[i]), MOD[i]);
            }
            check.addFirst(v);
            size++;
        }
        
        public void addLast(int v) {
            for(int i = 0; i < value.length; i++) {
                value[i] = mult(value[i], base, MOD[i]);
                value[i] = add(value[i], v, MOD[i]);
            }
            check.addLast(v);
            size++;
        }
        public void pollFirst() {
            int v = check.pollFirst();
            for(int i = 0; i < value.length; i++) {
                value[i] = sub(value[i], mult(v, exp[size-1][i], MOD[i]), MOD[i]);
            }
            size--;
        }
        
        @Override
        public boolean equals(Object o) {
            if(!(o instanceof RollingHash)) return false;
            RollingHash o2 = (RollingHash) o;
            for(int i = 0; i < value.length; i++) {
                if(this.value[i] != o2.value[i]) return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            int res = 0;
            int mod = (int) 1e9 + 9;
            for(int i = 0; i < value.length; i++) {
                res += value[i]%mod;
                res %= mod;
            }
            return res;
        }
        
        @Override
        public String toString() {
            String res = "";
            for(long i : value) res += i + " ";
            return res;
        }
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        
        String readNextLine() {
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
