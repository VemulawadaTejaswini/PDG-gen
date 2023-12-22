import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        TreeMap<String,HashSet<Integer>> tm=new TreeMap<>();
        String[] s=new String[n+1];
        int[] p=new int[n+1];
        for (int i = 1; i < n + 1; i++) {
            s[i]=sc.next();
            p[i]=sc.nextInt();
            if(tm.get(s[i])==null){
                HashSet<Integer> set=new HashSet<>();
                set.add(i);
                tm.put(s[i],set);
            }else {
                HashSet<Integer> set=tm.get(s[i]);
                set.add(i);
                tm.put(s[i],set);
            }
        }
        for (String key:tm.keySet()){
            HashSet<Integer> set=tm.get(key);
            TreeMap<Integer,Integer> TM=new TreeMap<>(Comparator.reverseOrder());
            for (Integer restaurant:set){
                TM.put(p[restaurant],restaurant);
            }
            while (!TM.isEmpty()){
                out.println(TM.pollFirstEntry().getValue());
            }
        }
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}