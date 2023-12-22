import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int N = r.i();
        int[][] xyh = new int[N][3];
        for(int i = 0; i < N; i++) xyh[i] = r.ii();
        for(int Cx = 0; Cx < 101; Cx++){
            loop: for(int Cy = 0; Cy < 101; Cy++){
                int H = Math.abs(Cx-xyh[0][0])+Math.abs(Cy-xyh[0][1])+xyh[0][2];                
                for(int i = 1; i < N; i++){
                    int[] xyhi = xyh[i]; 
                    if(xyhi[2] == 0) continue;
                    if(H != Math.abs(Cx-xyhi[0])+Math.abs(Cy-xyhi[1])+xyhi[2]) continue loop;
                }
                System.out.println(Cx + " " + Cy + " " + H);
                return;
            }
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