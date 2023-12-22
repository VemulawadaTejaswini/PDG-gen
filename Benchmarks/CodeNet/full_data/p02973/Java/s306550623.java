import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();     
        int N = r.i();
        ArrayList<Integer> list = new ArrayList<>(N);
        list.add(r.i());
        for(int i = 1; i < N; i++){
            int k = r.i();
            int id = binarySearch(list, k);
            if(id == -1){
                list.add(0, k);
            }
            else 
                list.set(id, k);
        }
        println(list.size());
    }
    static int binarySearch(ArrayList<Integer> list, int key){
        if(key <= list.get(0))
            return -1;
        int l = 0;
        int r = list.size()-1;
        int m = -1;
        while(l+1<r){            
            m = (l+r)/2;
            int a = list.get(m);
            if(key <= a){
                r = m;
            } else{
                l = m;
            }
        }
        if(m == -1){
            return list.get(1) < key ? 1 : 0; 
        }
        return m;
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