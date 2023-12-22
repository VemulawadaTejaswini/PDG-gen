import java.util.*;
import java.io.*;
//atcoder
public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        TreeMap<Integer, Integer> mapping = new TreeMap<>();
        for(int i = 0; i < (1 <<n); i++) {
            int next = scanner.nextInt();
            if (!mapping.containsKey(next)) mapping.put(next, 0);
            mapping.put(next, mapping.get(next) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(mapping.lastKey());
        mapping.put(list.get(0), mapping.get(list.get(0))-1);
        if (mapping.get(list.get(0)) != 0) {
            System.out.println("No");
            return;
        }
        else mapping.remove(list.get(0));
        for(int round = 1; round <= n; round++) {
            int sz = list.size();
            for(int j = 0; j < sz; j++) {
                int i = list.get(j);
                Integer lower = mapping.lowerKey(i);
                if (lower == null) {
                    System.out.println("No");
                    return;
                }
                else {
                    mapping.put(lower, mapping.get(lower)-1);
                    if (mapping.get(lower) == 0) mapping.remove(lower);
                    list.add(lower);
                }
            }
        }
        out.println("Yes");
        out.flush();
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
