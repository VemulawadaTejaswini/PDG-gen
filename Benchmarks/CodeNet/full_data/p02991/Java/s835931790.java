import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}

        ArrayList<Integer>[] nb = new ArrayList[N+1];
        for(int i = 1; i < N+1; i++)
            nb[i] = new ArrayList<>();

        for(int i = 0; i < M; i++){
            int u, v;
            {int[] a = r.ii(); u = a[0]; v = a[1];}
            nb[u].add(v);
        }

        ArrayList<Integer>[] next = new ArrayList[N+1];
        for(int i = 1; i < N+1; i++){
            ArrayList<Integer> A = new ArrayList<>();
            A.add(i);
            for(int j = 0; j < 3; j++){
                HashSet<Integer> hs = new HashSet<>();
                for(int a : A)
                    hs.addAll(nb[a]);
                A.clear();
                A.addAll(hs);
            }
            next[i] = A;
        }

        int S, T;
        {int[] a = r.ii(); S = a[0]; T = a[1];}
        int[] A = new int[N];
        int i = 0;
        boolean[] B = new boolean[N+1];
        A[i++] = S;
        for(int count = 1; i > 0; count++){
            int[] C = new int[N];
            int j = 0;
            for(int k = 0; k < i; k++){
                int v = A[k];
                B[v] = true;
                for(int u : next[v]){                  
                    if(u == T){
                        println(count);
                        return;
                    }
                    if(!B[u])
                        C[j++] = u;                
                }   
            }
            A = C;
            i = j;
        }
        println(-1);
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

