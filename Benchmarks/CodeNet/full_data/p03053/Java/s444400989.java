import java.io.*;
import java.util.*;
public class Main{
    static int[][] A;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int[] HW = r.ii();
        int H = HW[0],
            W = HW[1];
        A = new int[H][W];
        HashSet<Integer> queue = new HashSet<>();
        for(int i = 0; i < H; i++){
            String Ai = r.s();
            for(int j = 0; j < W; j++){
                A[i][j] = Ai.charAt(j) == '#' ? 1: 0;
                if(A[i][j] > 0) queue.add((int)Math.pow(2, i)*(2*j+1));
            }
        }
        int count = 0;
        while(true){
            HashSet<Integer> queue2 = new HashSet<>();
            for(int ij : queue){
                int i = getI(ij),
                    j = getJ(ij, i);
                turnBlack(i-1, j, queue2);
                turnBlack(i, j-1, queue2);
                turnBlack(i+1, j, queue2);
                turnBlack(i, j+1, queue2);
            }
            if(queue2.size() > 0){
                queue = queue2;
                count++;
            } else break;                   
        }
        print(count);
    }
    static int getI(int n){
        int count = 0;
        while(n%2 < 1){
            n /= 2;
            count++;
        }
        return count;
    }
    static int getJ(int n, int i){
        return n/(int)Math.pow(2, i+1);
    }
    static void turnBlack(int i, int j, HashSet<Integer> queue){
        try{
            if(A[i][j] < 1){
                A[i][j]++;
                queue.add((int)Math.pow(2, i)*(2*j+1));
            }
        } catch(ArrayIndexOutOfBoundsException e){}
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
            return readLine().split(" ");
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
    }
}