import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        String S = in.s();
        final int len = S.length();
        int Q = in.i();
        boolean dir = true;
        char[] frd = new char[Q];
        int fi = 0;
        char[] rev = new char[Q]; 
        int ri = 0;
        for(int i = 0; i < Q; i++){
            String[] s = in.ss();
            int T = Integer.parseInt(s[0]);
            if(T == 1){
                dir = !dir;
            } else {
                int F = Integer.parseInt(s[1]);
                char c = s[2].charAt(0);
                if(dir && F == 2 || !dir && F == 1){
                    frd[fi++] = c;
                } else {
                    rev[ri++] = c;
                }
            }
        }
        StringBuilder sb = new StringBuilder(len+Q);
        if(dir){
            for(int i = ri-1; i >= 0; i--){
                sb.append(rev[i]);
            }
            sb.append(S).append(frd);
        } else {
            for(int i = fi-1; i >= 0; i--){
                sb.append(frd[i]);
            }
            sb.append(S).append(rev);
        }
        out.println(sb);
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
