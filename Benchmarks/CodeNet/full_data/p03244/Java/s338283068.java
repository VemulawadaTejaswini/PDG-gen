import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        HashMap<Integer,Integer> even = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> odd = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            if(i % 2 == 0){
                even.put(k,even.getOrDefault(k,0)+1);
            }else{
                odd.put(k,odd.getOrDefault(k,0)+1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> sortedOdd = new ArrayList<>(odd.entrySet());
        ArrayList<Map.Entry<Integer,Integer>> sortedEven = new ArrayList<>(even.entrySet());
        Collections.sort(sortedOdd, (o1, o2) -> o2.getValue()-o1.getValue());
        Collections.sort(sortedEven, (o1, o2) -> o2.getValue()-o1.getValue());
        if(sortedEven.get(0).getKey() == sortedOdd.get(0).getKey()){
            if(sortedOdd.size() > 1 && sortedEven.size() > 1){
                pw.println(n-Math.max(sortedEven.get(1).getValue()+sortedOdd.get(0).getValue(),sortedEven.get(0).getValue()+sortedOdd.get(1).getValue()));
            }else if(sortedOdd.size() > 1){
                pw.println(n-Math.max(sortedEven.get(1).getValue()+sortedOdd.get(0).getValue(),sortedEven.get(0).getValue()));
            }else if(sortedEven.size() > 1){
                pw.println(n-Math.max(sortedOdd.get(0).getValue(),sortedEven.get(0).getValue()+sortedOdd.get(1).getValue()));
            }else{
                pw.println(n-Math.max(sortedOdd.get(0).getValue(),sortedEven.get(0).getValue()));
            }
        }else{
            pw.println(n-sortedEven.get(0).getValue()-sortedOdd.get(0).getValue());
        }
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
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
