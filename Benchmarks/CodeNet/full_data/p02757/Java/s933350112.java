import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, P; {int[] a = in.ii(); N = a[0]; P = a[1];}
        String S = in.s();
        long ans = 0;
        
        if(P != 2 && P != 5){
            int[] mod = new int[N+1];
            int ten = 1;
            
            for(int i = N-1; i >= 0; i--){
                int n = S.charAt(i) - '0';
                mod[i] = (mod[i+1] + ten * n) % P;
                ten = ten * 10 % P;
            }
            
            int[] count = new int[P];
            for(int i = 0; i <= N; i++){
                count[mod[i]]++;
            }
            
            for(int i = 0; i < count.length; i++){
                ans += (long)(count[i] - 1) * count[i] / 2;
            }        
        } else {
            int tmp = 0;
            for(int i = N-1; i >= 0; i--){
                int n = S.charAt(i) - '0';
                tmp += n % P == 0 ? 1 : 0; 
                ans += tmp;
            }
        }
        
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
