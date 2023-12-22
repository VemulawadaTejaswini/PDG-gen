import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int[][] A = new int[H][W];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                A[i][j] = sc.nextInt();
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                list.add(j);
                map.put(A[i][j], list);
            }
        }
        long[] d = new long[H * W + 1];
        for(int i=1; i<=H*W; i++){
            if(i<=D){
                d[i] = 0;
            }
            else{
                ArrayList<Integer> listx = map.get(i);
                ArrayList<Integer> listy = map.get(i - D);
                d[i] = d[i - D] + Math.abs(listx.get(0) - listy.get(0)) + Math.abs(listx.get(1) - listy.get(1));
            }
        }
        int Q = sc.nextInt();
        int[] L = new int[Q];
        int[] R = new int[Q];
        for(int i=0; i<Q; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            System.out.println(d[R[i]] - d[L[i]]);
        }
    }
}