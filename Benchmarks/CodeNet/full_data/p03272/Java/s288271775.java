import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args){
        FastScanner sc = new FastScanner(System.in);
        int N = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(N - i + 1);
    }
}

class FastScanner {
    BufferedReader br;
    StringTokenizer st;
    boolean hasNext;

    public FastScanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
        hasNext = true;
    }

    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                hasNext = false;
                return "##";
            }
        }
        return st.nextToken();
    }

    String next = null;
    public boolean hasNext(){
        next = nextToken();
        return hasNext;
    }

    public int nextInt() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Integer.parseInt(more);
    }

    public long nextLong() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Long.parseLong(more);
    }

    public double nextDouble() {
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return Double.parseDouble(more);
    }

    public String nextString(){
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return more;
    }

    public char nextChar(){
        if (next == null){
            hasNext();
        }
        String more = next;
        next = null;
        return more.charAt(0);
    }
}