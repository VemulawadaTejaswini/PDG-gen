import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();  
        int N = r.i();
        ArrayList<Integer>[] A = new ArrayList[N+1];
        Set<Integer> list = new HashSet<>();
        for (int i = 1; i <= N; i++){
            A[i] = r.ii();
            list.add(i);
        }
        for (int day = 1, count = N*(N-1)/2; ; day++) {
            Set<Integer> tmp = new HashSet<>();
            for (int i : list) {
                if (!tmp.contains(i) && A[i].size() > 0 && A[A[i].get(0)].get(0) == i){
                    tmp.add(i);
                    tmp.add(A[i].get(0));
                    count--;
                }
            }
            if (count == 0) {
                println(day);
                return;
            } else if (tmp.size() == 0){
                println(-1);
                return;
            } 
            for (int i : tmp) {
                A[i].remove(0);
            }
            list = tmp;
        }
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

        ArrayList<Integer> ii() throws IOException{
            String[] ss = ss();
            ArrayList<Integer> ii = new ArrayList<>();
            for(String s : ss) ii.add(Integer.parseInt(s));
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