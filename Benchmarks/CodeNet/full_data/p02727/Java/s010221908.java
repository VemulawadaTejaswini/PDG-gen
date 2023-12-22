import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int X, Y, A, B, C; {int[] a = in.ii(); X = a[0]; Y = a[1]; A = a[2]; B = a[3]; C = a[4];}
        int[] p = in.ii();
        int[] q = in.ii();
        int[] r = in.ii();
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        int ai = A-X;
        int bi = B-Y;

        int max = r[r.length-1];
        long ans = 0;
        for(int i = A-X; i < A; i++) {
            ans += p[i];
            if(p[i] < max){
                ai = i;
            }
        }
        for(int j = B-Y; j < B; j++){
            ans += q[j];
            if(q[j] < max){
                bi = j;
            }
        }

        long dif1 = 0;

        int ri = r.length - 1;
        for(int i = ai; i >= 0 && ri >= 0; i--){
            if(p[i] < r[ri]){
                dif1 = dif1- p[i] + r[ri];
                ri--;
            }
        }

        long dif2 = 0;
        ri = r.length - 1;
        for(int i = bi; i >= 0 && ri >= 0; i--){
            if(q[i] < r[ri]){
                dif2 = dif2- q[i] + r[ri];
                ri--;
            }
        }
        ans = ans + Math.max(dif1, dif2);
        out.println(ans);
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
