import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args){
        int N, M; {int[] a = in.ii(); N = a[0]; M = a[1];}
        
        ArrayList<int[]> city = new ArrayList<>(M);
        for(int i = 0; i < M; i++){
            int[] a = in.ii();
            city.add(new int[]{i, a[0], a[1]});
        }
        
        city.sort((x, y) -> {
            int d = x[1]-y[1];
            if(d != 0) return d;
            else return x[2]-y[2];
        });
        
        String[] number = new String[M];
        
        int[] c = city.get(0);
        for(int i = 0; i < M; ){
            int tmp = c[1];
            int j = 1;
            do {
                number[c[0]] = String.format("%06d%06d", tmp, j++);
            } while(++i < M && (c = city.get(i))[1] == tmp);    
        }
        
        for(int i = 0; i < M; i++)
            out.println(number[i]);        
        
        out.flush();
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
