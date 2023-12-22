import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int N, A, B, C, D;
        {
            int[] a = r.ii();
            N = a[0];
            A = a[1];
            B = a[2];
            C = a[3];
            D = a[4];
        }
        String s = r.s();
        for(int i = B; i < D-1; i++){
            if(s.charAt(i) == '#' && s.charAt(i+1) == '#'){
                println("No");
                return;
            }
        }
        for(int i = A; i < C-1; i++){
            if(s.charAt(i) == '#' && s.charAt(i+1) == '#'){
                println("No");
                return;
            }
        }
        if(C < D){
            println("Yes");
            return;
        }
        if(C == D){
            println("No");
        }
        for(int i = B+1; i < C-2; i++){
            if(s.substring(i-1, i+2).equals("...")){
                println("Yes");
                return;
            }
        }
        println("No");
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
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
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}
