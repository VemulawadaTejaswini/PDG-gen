import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        String s = r.s();
        int K = r.i(),
            len = s.length();
        SortedSet<String> sub = new TreeSet<>();
        for(int i = 0; i < len; i++){
            int limit = Math.min(K, len-i);
            for(int j = 0; j < limit; j++)
                sub.add(s.substring(i, i+j+1));            
        }
        print(new ArrayList<>(sub).get(K-1));
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int Int(String s){
            return Integer.parseInt(s);
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}