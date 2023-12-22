import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int N, M;
        {int[] a = r.ii(); N = a[0]; M = a[1];}
        int gcd = 1;
        int L = M/N;
        for(int i = 2; i <= L; i++){
            if(M%i == 0){
                gcd = i;
            }
        }
        print(gcd);
    }
    static void print(Object o){
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