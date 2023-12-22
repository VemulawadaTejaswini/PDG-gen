import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
        int t = 0;
        int x = 0;
        int y = 0;
        boolean flag = true;
        for(int i = 0; i < N; i++){
            int[] a = r.ii();
            int cost = Math.abs(x-a[1])+Math.abs(y-a[2]);
            int rest = a[0]-t-cost;
            if(rest < 0 || rest%2 > 0){
                flag = false;
                break;
            }
            t = a[0];
            x = a[1];
            y = a[2];
        }
        println(flag ? "Yes" : "No");
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        print(o+"\n");
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}
