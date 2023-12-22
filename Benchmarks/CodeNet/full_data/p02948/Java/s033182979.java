import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, M;
        {int[] a = in.ii(); N = a[0]; M = a[1];}
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(in.ii());
        }
        list.sort((x, y) -> x[0]-y[0]);
        list.add(new int[]{M+1, 0});
        
        long ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> -x+y);
        for(int i = 1, j = 0; i <= M; i++){
            while(list.get(j)[0] == i){
                q.add(list.get(j)[1]);
                j++;
            }
            Integer tmp = q.poll();
            ans += tmp == null ? 0 : tmp;
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
