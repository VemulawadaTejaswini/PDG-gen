import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();
    static int K;
    public static void main(String[] args){
        K = in.i();
        LinkedList<Long>[][] list = new LinkedList[11][10];
        for (int d = 0; d <= 10; d++) {
            list[d] = new LinkedList[10];
            for (int i = 0; i < 10; i++) {
                list[d][i] = new LinkedList<>();
            }
        }
        for (int i = 0; i < 10; i++) {
            list[1][i].add((long)i);
        }
        int count = 9;
        if (K < 10) {
            out.println(K);
            return;
        }
        for (int d = 2; d <= 10; d++) {
            for (int i = 0; i < 10; i++) {
                if (i - 1 >= 0) {
                    for (long x : list[d-1][i-1]) {
                        count = f(list, d, i, x, count);
                    }                     
                } 
                for (long x : list[d-1][i]) {
                    count = f(list, d, i, x, count);
                }    
                if (i + 1 <= 9) {
                    for (long x : list[d-1][i+1]) {
                        count = f(list, d, i, x, count);
                    }                     
                } 
            }
        }
    }

    static int f(LinkedList<Long>[][] list, int d, int i, long x, int count){
        long y = i * pow10(d - 1) + x;
        if(i != 0) {
            count++;
        }
        if (count == K) {
            out.println(y);
            System.exit(0);
        } else {
            list[d][i].add(y);              
        }
        return count;
    }
    
    static long pow10(int d){
        long ret = 1;
        for (int i = 0 ; i < d; i++) {
            ret *= 10;
        }
        return ret;
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

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
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
