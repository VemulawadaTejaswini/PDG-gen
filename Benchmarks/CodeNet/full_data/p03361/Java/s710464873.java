import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int H, W;
        {int[] a = in.ii(); H = a[0]; W = a[1];}
        boolean[][] s = new boolean[H+2][W+2];
        for(int i = 1; i <= H; i++){
            char[] c = in.s().toCharArray();
            for(int j = 1; j <= W; j++){
                s[i][j] = c[j-1] == '#'; 
            }
        }
        boolean flag = true;
        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= W; j++){
                if(s[i][j] && !s[i][j-1] && !s[i][j+1] && !s[i+1][j] && !s[i-1][j]){
                    flag = false;
                    break;
                }
            }
        }
        out.println(flag ? "Yes" : "No");
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
