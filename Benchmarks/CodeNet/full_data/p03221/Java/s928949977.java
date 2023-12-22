import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int[] a = r.ii();
        int N = a[0],
            M = a[1];        
        int[] P = new int[M],
              Y = new int[M];
        ArrayList<Integer>[] pre = new ArrayList[N+1];
        for(int i = 0; i < M; i++){
            int[] b = r.ii();
            if(pre[b[0]] == null) pre[b[0]] = new ArrayList<>();
            pre[b[0]].add(b[1]);
            P[i] = b[0];
            Y[i] = b[1];
        }
        for(ArrayList list : pre) if(list != null) list.sort(null);
        for(int i = 0; i < M; i++){
            System.out.printf("%06d",P[i]);
            System.out.printf("%06d\n",pre[P[i]].indexOf(Y[i])+1);
        }     
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
    }
}