import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] id;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();
        id = new int[H*W];
        for(int i=0;i<id.length;i++) id[i]=i;
        int[][] board = new int[H][W];
        for(int i=0;i<H;i++){
            String cur = sc.next();
            for(int j=0;j<W;j++) board[i][j] = cur.charAt(j)=='#'?1:0;
        }
        int[] dx = new int[]{1,0,-1,0}, dy = new int[]{0,1,0,-1};
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                for(int k=0;k<4;k++){
                    int r = i+dx[k], c = j+dy[k];
                    if(r>=0&&r<H&&c>=0&&c<W&&board[i][j]!=board[r][c]) union(i*W+j,r*W+c);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(board[i][j]==0) continue;
                for(int r=0;r<H;r++){
                    for(int c=0;c<W;c++){
                        if(board[i][j]==board[r][c]) continue;
                        if(find(i*W+j)==find(r*W+c)) ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static int find(int p){
        while(id[p]!=p){
            id[p] = id[id[p]];
            p = id[p];
        }
        return id[p];
    }
    static void union(int p, int q){
        int i=find(p), j=find(q);
        if(i==j) return;
        id[j] = i;
    }
}
