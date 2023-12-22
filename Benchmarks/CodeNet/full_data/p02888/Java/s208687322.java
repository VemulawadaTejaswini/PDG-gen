import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        ArrayList<Integer> L = in.ii();
        L.sort((x, y) -> -x+y);
        
        ArrayList<Integer>[] s = new ArrayList[N-1];
        for(int i = 1; i < N-1; i++){
            s[i] = new ArrayList<>();
            int Li = L.get(i);
            for(int j = i+1; j < N; j++){
                s[i].add(0, Li+L.get(j));
            }
        }

        long ans = 0;
        for(int i = 0; i < N-2; i++){
            int Li = L.get(i);
            for(int j = i+1; j < N-1; j++){
                int k = Collections.binarySearch(s[j], Li);
                int size = s[j].size();
                if(k < 0){
                    k = -k-1;
                    ans += size-k;
                } else {
                    while(k < size && s[j].get(k) == Li){
                        k++;
                    }
                    ans += size-k;
                }
            }            
        }

        out.println(ans);
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

        ArrayList<Integer> ii(){
            String[] ss = ss();
            ArrayList<Integer> ii = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) ii.add(Integer.parseInt(ss[j]));
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
