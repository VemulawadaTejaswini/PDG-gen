import java.util.*;
import java.io.*;
 
public class Main {
    static char[] s;
    static boolean solved = false;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        s = sc.next().toCharArray();
        boolean[] plus = new boolean[s.length-1];
        divide(plus,0);
    }
    
    public static boolean divide(boolean[] p, int index){
        if(p.length == index){
            if(calc(p)){
                return true;
            }else{
                return false;
            }
        }
        if(divide(p,index+1)){
            return true;
        }
        p[index] = true;
        if(divide(p,index+1)){
            return true;
        }
        p[index] = false;
        return false;
    }
    
    public static boolean calc(boolean[] p){
        if(solved){
            return true;
        }
        int tmp = Integer.parseInt(String.valueOf(s[0]));
        for(int i = 0; i < p.length; i++){
            if(p[i]){
                tmp += Integer.parseInt(String.valueOf(s[i+1]));
            }else{
                tmp -= Integer.parseInt(String.valueOf(s[i+1]));
            }
        }
        if(tmp == 7){
            char op1 = p[0] ? '+' : '-';
            char op2 = p[1] ? '+' : '-';
            char op3 = p[2] ? '+' : '-';
            System.out.println(""+s[0] + op1 + s[1] + op2 + s[2] + op3 + s[3]+"=7");
            return true;
        }else{
            return false;
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
