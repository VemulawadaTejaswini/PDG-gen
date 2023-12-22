import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        HashMap<Integer,Integer> odds = new HashMap<>();
        HashMap<Integer,Integer> evens = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(i % 2 == 0){
                if(evens.containsKey(a)){
                    evens.put(a,evens.get(a)+1);
                }else{
                    evens.put(a,1);
                }
            }else{
                if(odds.containsKey(a)){
                    odds.put(a,odds.get(a)+1);
                }else{
                    odds.put(a,1);
                }
            }
        }
        int oddfk = 0;
        int oddfv = 0;
        int oddsk = 0;
        int oddsv = 0;
        int evenfk = 0;
        int evenfv = 0;
        int evensk = 0;
        int evensv = 0;
        for(Map.Entry<Integer,Integer> e : odds.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(oddfv <= v){
                oddsk = oddfk;
                oddsv = oddfv;
                oddfk = k;
                oddfv = v;
            }else if(oddsv < v){
                oddsk = k;
                oddsv = v;
            }
        }
        for(Map.Entry<Integer,Integer> e : evens.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(evenfv <= v){
                evensk = evenfk;
                evensv = evenfv;
                evenfk = k;
                evenfv = v;
            }else if(evensv < v){
                evensk = k;
                evensv = v;
            }
        }
        //System.out.println(n+" "+" "+oddfv+" "+evenfv);
        System.out.println(oddfk == evenfk ? n-oddfv-evenfv+Math.min(oddfv-oddsv,evenfv-evensv) : n-oddfv-evenfv);
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
