import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();   
        int H, W;
        {int[] a = r.ii(); H = a[0]; W = a[1];}
        char[][] a = new char[H][W];
        boolean[] hIs = new boolean[H],
        wIs = new boolean[W];
        for(int i = 0; i < H; i++){
            String s = r.s();
            for(int j = 0; j < W; j++){
                a[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < H; i++){
            char base = a[i][0];
            hIs[i] = false;
            for(int j = 1; j < W; j++){
                if(base != a[i][j]){
                    hIs[i] = true;
                    break;
                }
            }
        }
        for(int j = 0; j < W; j++){
            char base = a[0][j];
            wIs[j] = false;
            for(int i = 1; i < H; i++){
                if(base != a[i][j]){
                    wIs[j] = true;
                    break;
                }
            }
        }
        for(int i = 0; i < H; i++){
            if(hIs[i]){
                for(int j = 0; j < W; j++){
                    if(wIs[j]){
                        print(a[i][j]);
                    }
                }
                print("\n");
            }
        }
    }

    static void print(Object o){
        System.out.print(o.toString());
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