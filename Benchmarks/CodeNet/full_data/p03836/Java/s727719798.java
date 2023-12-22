import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int sx, sy, tx, ty; 
        {int[] a = in.ii(); sx = a[0]; sy = a[1]; tx = a[2]; ty = a[3];}
        StringBuilder sb = new StringBuilder();
        int x = sx;
        int y = sy;
        int dx = tx-sx;
        int dy = ty-sy;
        char[] ans = new char[4*(dx+dy)+8];
        int j = 0;
        for(int i = dx; i != 0; i--){
            ans[j++] = 'R';
        }
        for(int i = dy; i != 0; i--){
            ans[j++] = 'U';
        }
        for(int i = dx; i != 0; i--){
            ans[j++] = 'L';
        }
        for(int i = dy+1; i != 0; i--){
            ans[j++] = 'D';
        }
        for(int i = dx+1; i != 0; i--){
            ans[j++] = 'R';
        }
        for(int i = dy+1; i != 0; i--){
            ans[j++] = 'U';
        }
        ans[j++] = 'L';
        ans[j++] = 'U';
        for(int i = dx+1; i != 0; i--){
            ans[j++] = 'L';
        }
        for(int i = dy+1; i != 0; i--){
            ans[j++] = 'D';
        }
        ans[j++] = 'R';
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
