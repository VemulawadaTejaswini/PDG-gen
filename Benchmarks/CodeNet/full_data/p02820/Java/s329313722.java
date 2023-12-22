import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N, K, R, S, P;
        {int[] a = in.ii(); N = a[0]; K = a[1];
            a = in.ii(); R = a[0]; S = a[1]; P = a[2];}
        char[] T = in.s().toCharArray();
        int ans = 0;
        for(int i = 0; i < K; i++){
            for(int j = 0; i+K*j < N; ){
                while(i+K*(j+1) < N && T[i+K*j] != T[i+K*(j+1)]){
                    char c0 = T[i+K*j];
                    ans += c0 == 's' ? R : c0 == 'p' ? S : P;
                    j++;
                    //out.print(c0);
                }
                if(i+K*(j+1) >= N){
                    char c0 = T[i+K*j];
                    ans += c0 == 's' ? R : c0 == 'p' ? S : P;
                    //out.print(c0);
                    break;
                }
                //out.print(" ");
                char c0 = T[i+K*j];
                int count = 0;
                while(i+K*j < N && c0 == T[i+K*j]){
                    count++;
                    j++;
                    //out.print(c0);
                }
                int point = c0 == 's' ? R : c0 == 'p' ? S : P;
                ans += (count+1)/2*point;
            }
            //out.println();
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
