import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();      
        int[][] c = new int[3][];
        int sum = 0;
        for(int i = 0; i < 3; i++)
            c[i] = r.ii();
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                sum += c[i][j]; 
        boolean flag = true;
        loop:for(int i = 0; i < 3; i++){
            for(int d = 1; d < 3; d++){
                int j = (i+d)%3;
                int k = 3-i-j;
                int s = c[0][i] + c[1][j] + c[2][k];
                if(3*s != sum){
                    flag = false;
                    break loop;
                }
            }
        }
        println(flag ? "Yes" : "No");                
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