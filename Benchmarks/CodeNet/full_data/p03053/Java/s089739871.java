import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;
import java.awt.Point;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[][] A = new String[H][W];
        ArrayDeque<Point> que = new ArrayDeque<>();
        boolean[][] memo = new boolean[H][W];
        int[][] ans = new int[H][W];

        for(int i=0; i<H; i++){
            A[i] = sc.next().split("");
            for(int j=0; j<H; j++){
                if(A[i][j].equals("#")){
                    que.add(new Point(i, j));
                    memo[i][j] = true;
                    ans[i][j] = 0;
                }
            }
        }
        int[] dh = {1, 0, -1, 0};
        int[] dw = {0, 1, 0, -1};
        while(!que.isEmpty()){
            Point p = que.pop();
            for(int i=0; i<4; i++){
                int h = p.x + dh[i];
                int w = p.y + dw[i];
                if(h>=0 && h<H && w>=0 && w<W){
                    if(!memo[h][w] && A[h][w].equals(".")){
                        memo[h][w] = true;
                        que.add(new Point(h, w));
                        ans[h][w] = ans[p.x][p.y] + 1;
                    }
                }
            }
        }
        int max = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                max = Math.max(max, ans[i][j]);
            }
        }
        System.out.println(max);
    }
}
