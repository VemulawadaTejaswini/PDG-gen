import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[][] A = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                A[i][j] = sc.nextInt();
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                map.put(A[i][j], l);
            }
        }
        int Q = sc.nextInt();
        int[][] L = new int[2][Q];
        for(int i = 0; i < Q; i++){
            L[0][i] = sc.nextInt();
            L[1][i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < Q; i++){
            int dis = 0;
            for(int j = L[0][i]; j < L[1][i]; j+=D){
                int x1 = map.get(j).get(0);
                int y1 = map.get(j).get(1);
                int x2 = map.get(j+D).get(0);
                int y2 = map.get(j+D).get(1);
                dis += Math.abs(x1-x2)+Math.abs(y1-y2);
            }
            System.out.println(dis);
        }
    }
}