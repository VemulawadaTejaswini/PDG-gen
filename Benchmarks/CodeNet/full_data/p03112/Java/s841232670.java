import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args){
        final int A, B, Q;
        {int[] a = in.ii(); A = a[0]; B = a[1]; Q = a[2];}
        long[] s = in.ll(A);
        long[] t = in.ll(B);
        long[] x = in.ll(Q);
        MyList sl = new MyList();
        MyList tl = new MyList();

        for(int i = 0; i < Q; i++){
            long xi = x[i];
            int k1 = binarySearch(s, xi);
            int k2 = binarySearch(t, xi);
            if(k1 < 0){
                sl.add(-k1-1, s);
                sl.add(-k1-2, s);
            } else
                sl.add(k1, s);

            if(k2 < 0){
                tl.add(-k2-1, t);
                tl.add(-k2-2, t);
            } else
                tl.add(k2, t);
            long min = Long.MAX_VALUE;
            for(int j = 0; j < sl.size; j++){
                for(int k = 0; k < tl.size; k++){
                    long tmp = getLength(xi, sl.arr[j], tl.arr[k]);
                    if(tmp < min) min = tmp;
                }
            }
            out.println(min);
            sl.clear();
            tl.clear();
        }

        out.flush();
    }

    static long getLength(long x, long a, long b){
        return Math.min(Math.abs(x-a), Math.abs(x-b)) + Math.abs(b-a);
    }

    public static class MyList {
        int size = 0;
        long[] arr = new long[2];

        void add(int i, long[] ll){
            if(0 <= i && i < ll.length)
                arr[size++] = ll[i];
        }

        void clear(){
            size = 0;
        }  

    }
    public static int binarySearch(long[] array, long key){
        int left = 0;
        int right = array.length-1;
        while(true){
            int middle = left + (right - left)/2;
            long value = array[middle];
            if(value == key){
                return middle;
            } else if(value < key){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            if(right < left){
                return -1-(left < middle ? middle : left);
                // return -1;
            }
        }
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long[] ll(int N){
            long[] ll = new long[N];
            for(int j = 0; j < N; j++) ll[j] = l();
            return ll;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
