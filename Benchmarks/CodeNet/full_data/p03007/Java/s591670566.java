import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        MyReader r = new MyReader();        
        int N = r.i();
        ArrayList<Integer> A = new ArrayList<>();
        String[] s = r.ss();

        int ps = 0;
        int ng = 0;
        int ans = 0;
        for(String t : s){
            int a = Int(t);
            if(a > 0){
                ps++;
                ans += a;
            }
            else if(a < 0){
                ng++;
                ans -= a;
            }
            A.add(a);
        }

        int zero = N-ps-ng;
        String[] res = new String[N];
        int k = 0;
        if(ng+zero == 0){
            int min = A.get(0);
            int i = 0;
            for(int j = 1; j < N; j++){
                int x = A.get(j);
                if(x < min){
                    min = x;
                    i = j;
                }                   
            }
            res[k++] = String.valueOf(ans-min*2);
            A.add(1, A.remove(i));
            for(i = 2; i < A.size(); ){
                res[k++] = A.get(1)+" "+A.get(i);
                A.set(1, A.get(1)-A.remove(i));
            }
            res[k++] = A.get(0)+" "+A.get(1);
        } else if(ps+zero == 0){
            int max = A.get(0);
            int i = 0;
            for(int j = 1; j < N; j++){
                int x = A.get(j);
                if(max < x){
                    max = x;
                    i = j;
                }                   
            }
            res[k++] = String.valueOf(ans+max*2);   
            A.add(0, A.remove(i));
            for(i = 1; i < A.size(); ){
                res[k++] = A.get(0)+" "+A.get(i);
                A.set(0, A.get(0)-A.remove(i));
            }
        } else{
            res[k++] = String.valueOf(ans);
            int i = 0;
            while(i < N && A.get(i) < 0)
                i++;
            A.add(0, A.remove(i));
            i = 1;
            while(i < N && A.get(i) > 0)
                i++;
            A.add(1, A.remove(i));
            for(i = 2; i < A.size(); ){
                if(A.get(i) >= 0){
                    res[k++] = A.get(1)+" "+A.get(i);
                    A.set(1, A.get(1)-A.remove(i));
                } else{
                    res[k++] = A.get(0)+" "+A.get(i);
                    A.set(0, A.get(0)-A.remove(i));
                }
            }
            res[k++] = A.get(0)+" "+A.get(1);
        }        
        for(String t : res)
            println(t);
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

    static int min(int... ii){
        int min = ii[0];
        for(int i : ii) if(i < min) min = i;
        return min;
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
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}