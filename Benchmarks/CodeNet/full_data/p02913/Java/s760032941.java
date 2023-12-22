import java.util.*;
import java.io.*;

public class Main {
    static final long base = 89;
    static final long base2 = 229;
    static final long mod = 982451653;
    static final long mod2 = 961748941;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        int hi = n/2;
        int lo = 0;
        while(hi >= lo) {
            int mid = (hi + lo)/2;
            if (check(mid, s, n)) lo = mid + 1;
            else hi = mid-1;
        }
        out.println(lo-1);
        out.flush();
    }
    static boolean check(int mid, char[] s, int n) {
        TreeMap<Long, Integer> f1 = new TreeMap<>();
        TreeMap<Long, Integer> f2 = new TreeMap<>();
        long ch = 0;
        long ch2 = 0;
        for(int i = 0; i < mid; i++) {
            ch = add(mod,base,s[i]-'a' + 1, ch);
            ch2 = add(mod2,base2,s[i]-'a' + 1, ch2);
        }
        f1.put(ch, 0);
        f2.put(ch2, 0);
//        System.out.println("MID " + mid);
//        System.out.println("HASHES: 0" + ch + " " +ch2);
        long sub = modPow(base, mid, mod);
        long sub2 = modPow(base2, mid, mod2);
        for(int i = mid; i < n; i++) {
            ch = add(mod,base, s[i]-'a' + 1, ch);
            ch2 = add(mod2,base2,s[i]-'a' + 1, ch2);
            ch = sub(mod, s[i-mid]-'a'+1,ch,sub);
            ch2 = sub(mod2, s[i-mid]-'a'+1,ch2,sub2);
//            System.out.println("HASHES: " +(i-mid+1) + " " + ch + " " +ch2);
            if (!f1.containsKey(ch)) {
                f1.put(ch, i-mid+1);
            }
            if (!f2.containsKey(ch2)) {
                f2.put(ch2, i-mid+1);
            }
            if (i-f1.get(ch) >= mid && i-f2.get(ch2)>=mid) return true;
        }
        return false;
    }
    static long add(long m, long b, long v, long c) {
        return (c * b + v) % m;
    }
    static long sub(long m, long v, long c, long s) {
        return (((c - s * v)% m)+m )% m;
    }
    static long modPow(long x, long p, long m) {
        if (p == 0) return 1L;
        long v = modPow(x, p/2, m);
        v = (v * v) % m;
        if (p % 2 == 0) return v;
        return (v * x) % m;
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
