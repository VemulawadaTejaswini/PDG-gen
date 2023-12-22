import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader(); 
        
        int N = r.i();
        
        ArrayList<Integer> s = new ArrayList<>(1<<N);
        for(String i : r.ss())
            s.add(Integer.parseInt(i));
            
        s.sort((x, y) -> -x+y);
        
        int[] leaf = {s.remove(0)};
        
        for(int h = 0; h < N; h++){
            int[] newLeaf = new int[leaf.length*2];
            int i = 0;
            for(int v : leaf){
                int w = 0;
                Iterator<Integer> iterator = s.iterator();
                while(iterator.hasNext()){
                    int t = iterator.next();
                    if(t < v){
                        w = t;
                        break;
                    }          
                }
                if(w == 0){
                    println("No");
                    return;
                }
                iterator.remove();
                newLeaf[i++] = v;
                newLeaf[i++] = w;
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