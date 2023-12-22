import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        final int H, W, N; {int[] a = in.ii(); H = a[0]; W = a[1]; N = a[2];}
        HashMap<Long, Integer> hm = new HashMap<>();
        long b = 1_000_000_001;
        for(int i = 0; i < N; i++){
            int[] c = in.ii();
            for(int j = 0; j < 9; j++){
                int h = c[0] - j/3;
                int w = c[1] - j%3;
                if(0 < h && h < H-1 && 0 < w && w < W-1){
                    long d = h*b + w;
                    hm.put(d, hm.getOrDefault(d, 0)+1);
                }
            }
        }
        int[] ans = new int[10];
        long ans0 = (long)(H-2)*(W-2);
        for(Map.Entry<Long, Integer> e : hm.entrySet()){
            ans[e.getValue()]++;
        }
        for(int i = 1; i < ans.length; i++){
            ans0 -= ans[i];
        }
        out.println(ans0);
        for(int i = 1; i < ans.length; i++){
            out.println(ans[i]);
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
