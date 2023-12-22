import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        
        int N = r.i();
        
        PriorityQueue<Integer> s = new PriorityQueue<>((x, y) -> -x+y);
        for(String i : r.ss())
            s.add(Integer.parseInt(i));
            
        ArrayList<Integer> leaf = new ArrayList<>();
        leaf.add(s.poll());
        
        for(int h = 0; h < N; h++){
            ArrayList<Integer> newLeaf = new ArrayList<>();
            for(int v : leaf){
                ArrayList<Integer> tmp = new ArrayList<>();
                int w = s.poll();
                while(v <= w){
                    tmp.add(w);
                    try{
                        w = s.poll();
                    } catch(Exception e){
                        println("No");
                        return;
                    }
                }
                s.addAll(tmp);
                Collections.addAll(newLeaf, v, w);
            }        
            leaf = newLeaf;
        }
        println("Yes");
    }
    static void printS(int[] s){
        StringBuilder sb = new StringBuilder();
        for(int i : s)
            sb.append(i).append(' ');
        println(sb);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
    }
}