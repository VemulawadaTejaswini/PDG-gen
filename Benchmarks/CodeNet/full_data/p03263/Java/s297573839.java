import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int H, W;
        {int[] a = r.ii(); H = a[0]; W = a[1];}
        int[][] a = new int[H][W];
        for(int i = 0; i < H; i++) a[i] = r.ii();
        int count = 0;
        ArrayList<String> operation = new ArrayList<>();
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(a[i][j]%2 > 0){
                    if(j+1 < W){
                        if(a[i][j+1]%2 > 0){
                            count++;
                            a[i][j+1] = 0;
                            operation.add((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
                            continue;
                        }    
                    }                    
                    if(i+1 < H){
                        count++;
                        if(a[i+1][j]%2 > 0){                            
                            a[i+1][j] = 0;
                            operation.add((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1));
                        } else{
                            if(j+1 < W){
                                a[i][j+1] = 1;
                                operation.add((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
                            } else{
                                a[i+1][j] = 1;
                                operation.add((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1));
                            }                                
                        }
                        
                    }
                }
            }
        }
        print(count);
        for(String s : operation){
            print(s);
        }
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