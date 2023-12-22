import java.io.*;
public class Main{
    static int H, W;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        {int[] a = r.ii(); H = a[0]; W = a[1];} 
        char[][] S = new char[H][];
        int[][] direction = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, 
                             {0, 1}, {1, -1}, {1, 0}, {1,1}};
        int inf = Integer.MIN_VALUE;
        for(int i = 0; i < H; i++)
            S[i] = r.s().toCharArray();
        int[][] num = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(S[i][j] == '#'){
                    num[i][j] = inf;
                    for(int[] d : direction){
                        int x = i+d[0];
                        int y = j+d[1];
                        if(exists(x, y)){
                            num[x][y]++;
                        }                        
                    }
                }
            }
        }
        for(int[] n : num){
            for(int k : n)
                if(k >= 0)
                    print(k);
                else
                    print('#');
            println("");
        }
    }
    static boolean exists(int i, int j){
        return 0 <= i && i < H && 0 <= j && j < W;
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