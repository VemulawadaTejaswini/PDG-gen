import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        int[] A = in.ii();
        int[] B = in.ii();
        ArrayList<int[]> AA = new ArrayList<>();
        ArrayList<int[]> AB = new ArrayList<>();
        for(int i = 0; i < N; i++){
            AB.add(new int[]{A[i], B[i]});
        }
        AB.sort((x, y) -> x[1]-y[1]);
        for(int i = 0; i < N; i++){
            AA.add(new int[]{i, AB.get(i)[0]});
        }
        AA.sort((x, y) -> x[1]-y[1]);
        boolean f = true;
        for(int i = 0; i < N; i++){
            if(AA.get(i)[1] > AB.get(i)[1]){
                f = false;
                break;
            }
        }
        if(f){
            int i = 0;
            int count = 0;
            while(AA.get(i)[0] != 0){
                count++;
                i = AA.get(i)[0];
            }
            if(count < N-1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
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
