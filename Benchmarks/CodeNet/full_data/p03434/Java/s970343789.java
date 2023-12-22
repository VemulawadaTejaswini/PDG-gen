import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();      
        int N = r.i();
        int[] a = r.ii();
        java.util.Arrays.sort(a);
        int sign = 1;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[a.length-1-i]*sign;
            sign = -sign;
        }        
        println(sum);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
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
        int Int(String s){
            return Integer.parseInt(s);
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