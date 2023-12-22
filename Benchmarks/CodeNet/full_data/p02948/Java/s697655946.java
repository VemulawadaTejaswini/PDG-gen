import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, M;
        {int[] a = in.ii(); N = a[0]; M = a[1];}
        int[][] reward = new int[100000][N];
        int[] len = new int[100000];
        for(int i = 0; i < N; i++){
            int[] tmp = in.ii();
            int A = tmp[0]-1;
            int B = tmp[1];
            reward[A][len[A]++] = B;
        }
        
        long ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> -x+y);
        for(int i = 0; i < M; i++){
            int li = len[i];
            int[] ri = reward[i];
            for(int j = 0; j < li; j++){
                q.add(ri[j]);
            }
            Integer tmp = q.poll();
            ans += tmp == null ? 0 : tmp;
        }
        System.out.println(ans);
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
