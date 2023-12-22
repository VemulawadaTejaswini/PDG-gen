import java.io.*;
import java.io.IOException;
import java.util.*;


@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        String[] S = new String[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                S[i] = sc.next();
        }
        solve(N, S);
    }

    static void solve(long N, String[] S){
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : S) {
            if(!hm.containsKey(s)) hm.put(s, 1);
            else hm.put(s, hm.get(s)+1);
        }

        ArrayList<Pair<Integer, String>> al = new ArrayList<>();
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            Pair<Integer, String> p = new Pair(e.getValue(), e.getKey());
            al.add(p);
        }
        Collections.sort(al);
        Collections.reverse(al);

        ArrayList<String> piyo = new ArrayList<>();
        int max = -9;
        for (Pair<Integer,String> pair : al) {
            if(pair.first >= max)  max = pair.first;
            else break;
            piyo.add(pair.second);
        }
        Collections.sort(piyo);
        for (String s : piyo) {
            System.out.println(s);
        }
    }

    static public class Pair<S extends Comparable<S>, T extends Comparable<T>> implements Comparable<Pair<S,T>> {
        public S first;
        public T second;
    
        public Pair(S first, T second){
            this.first = first;
            this.second = second;
        }
    
        @Override
        public int compareTo(Pair<S,T> pair){
            int result = this.first.compareTo(pair.first);
            if(result != 0) return result;
            else return this.second.compareTo(pair.second);
        }
    
        @Override
        public boolean equals(Object obj) {
            if(obj == this) return true;
            else if(obj == null || obj.getClass() != this.getClass()) return false;
            else {
                Pair<S,T> pair = (Pair<S,T>)obj;
                return this.compareTo(pair) == 0;
            }
        } 
    }


    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            return nn();
        }

        String nextLine() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}
