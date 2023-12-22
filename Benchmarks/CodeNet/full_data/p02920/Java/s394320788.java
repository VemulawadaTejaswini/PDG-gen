import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null; }
        String next() { while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try { tokenizer = new StringTokenizer(reader.readLine()); } 
                catch (IOException e) { throw new RuntimeException(e);} }
            return tokenizer.nextToken(); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    static TreeMap<Integer, Integer> set = new TreeMap<Integer, Integer>(); // multiset
    static TreeMap<Integer, Integer> ans = new TreeMap<Integer, Integer>(); // slimes that need to be made

    public static void main(String[] args) {
        
        int n = r.nextInt();
        set = new TreeMap<Integer, Integer>(); // multiset
        ans = new TreeMap<Integer, Integer>(); // slimes that need to be made
        for(int i = 1; i <= 1 << n; i++){
            add(ans, r.nextInt());
        }
        add(set, ans.lastKey());

        for(int i = 1; i <= n; i++){ // seconds
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(Map.Entry<Integer, Integer> e : set.entrySet()){
                for(int j = 1; j <= e.getValue(); j++){
                    list.add(e.getKey());
                }
            }
            for(int k : list){
                if(ans.lowerKey(k) == null){
                    pw.println("No");
                    pw.close();
                    System.exit(0);
                }
                add(set, ans.lowerKey(k));
                remove(ans, ans.lowerKey(k));
            }       
        }
        pw.println("Yes");


        pw.close();
    }

    public static void add(TreeMap<Integer, Integer> set, int value){
        if(set.containsKey(value)){
            set.replace(value, set.get(value) + 1);
        } else{
            set.put(value, 1);
        }
    }

    public static void remove(TreeMap<Integer, Integer> set, int value){
        if(set.containsKey(value)){
            set.replace(value, set.get(value) - 1);
            if(set.get(value).equals(0)){
                set.remove(value);
            }
        } else {
            System.out.println("ERROR: THE SET DOES NOT CONTAIN THIS VALUE");
            System.exit(-1);
        }
    }
}

/**
                _        _                 _                                                
               | |      | |               | |                                               
   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  
  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ 
 | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |
  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ 
                                __/ |                               ______ __/ |            
                               |___/                               |______|___/             
 */