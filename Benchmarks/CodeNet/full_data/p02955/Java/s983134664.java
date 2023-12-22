import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader rd = new MyReader();  
        int N, K; {int[] a = rd.ii(); N = a[0]; K = a[1];}
        long[] A = rd.ll();
        long S = 0;
        for(long a : A)
            S += a;
       
        ArrayList<Long> list = new ArrayList<>();
        double root = Math.sqrt(S);
        for(long i = 1; i < root; i++){
            if(S%i == 0){
                int j = list.size()/2;
                list.add(j, i);
                list.add(j+1, S/i);
            }
        }
        if(root%1 == 0)
            list.add(list.size()/2, (long)root);
            
        for(int i = list.size()-1; i >= 0; i--){
            long d = list.get(i);
            long[] array = new long[N];
            int size = 0;
            for(int j = 0; j < N; j++){
                long r = A[j]%d;
                if(r > 0)
                    array[size++] = r;                  
            }
            Arrays.parallelSort(array, 0, size);
            long left = 0;
            long right = d*size;
            for(long r : array)
                right -= r;
            for(long r : array){
                if(left <= K && right <= K){
                    println(d);
                    return;
                } else{
                    left += r;
                    right -= d-r;
                }
            }
        }
        println(1);
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