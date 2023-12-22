import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N = in.i();
        String S = in.s();
        int r = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
            int c = S.charAt(i);
            if (c == 'R') {
                r++;
            } else if (c == 'G') {
                g++;
            } else {
                b++;
            }        
        }
        long ans = (long)r * g * b; 
        
        int iMax = (N - 1) / 2;
        for (int i = 1; i <= iMax; i++) {
            int jMax = N - 1 - 2 * i;
            for (int j = 0; j <= jMax; j++) {
                char c1 = S.charAt(j);
                char c2 = S.charAt(j + i);
                char c3 = S.charAt(j + i + i);
                if (c1 != c2 && c2 != c3 && c3 != c1) {
                    ans--;
                }
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
