import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int N, M; {int[] a = in.ii(); N = a[0]; M = a[1];}
        int[] number = new int[N];
        boolean flag = true;
        for(int i = 0; i < M; i++){
            int s, c; {int[] a = in.ii(); s = a[0]; c = a[1];}
            if(number[s-1] == 0){
                number[s-1] = c;
            } else if(number[s-1] != c){
                flag = false;
                break;
            }
        }
        flag &= number[N-1] != 0;
        if(flag){
            for(int i = 0; i < N; i++){
                out.print(number[i]);
            }
            out.println();
        } else {
            out.println(-1);
        }
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
