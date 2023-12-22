import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int M, limit, max = 1;
        {int[] a = r.ii(); M = a[1]; limit = M/a[0];}
        for(int i = 1; i*i < M+1; i++){
            if(M%i == 0){
                if(i <= limit) max = i;
                else break;
                int pair = M/i;
                if(pair <= limit){
                    max = pair;
                    break;
                }
            }
        }
        print(max);
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