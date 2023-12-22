import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
        int[] u = new int[N-1],
              v = new int[N-1],
              w = new int[N-1];
        ArrayList<int[]>[] T = new ArrayList[N];
        int[] color = new int[N];
        Arrays.fill(color, -1);
        for(int i = 0; i < N; i++)
            T[i] = new ArrayList<>();
        for(int i = 0; i < N-1; i++){
            int[] a = r.ii();
            u[i] = a[0];
            v[i] = a[1];
            w[i] = a[2];
            T[u[i]-1].add(new int[]{v[i], w[i]});
            T[v[i]-1].add(new int[]{u[i], w[i]});
        }
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        color[0] = 0;
        while(A.size() > 0){
            int s = A.remove(0);
            ArrayList<int[]> set = T[s-1];
            for(int[] t : set){
                if(color[t[0]-1] < 0){
                    if(t[1]%2 == 0)
                        color[t[0]-1] = color[s-1];
                    else
                        color[t[0]-1] = 1- color[s-1];
                    A.add(t[0]);
                }
            }
        }
        for(int c : color)
            print(c);
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int Int(String s){
            return Integer.parseInt(s);
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}
