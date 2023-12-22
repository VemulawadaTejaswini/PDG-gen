import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc  = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int [][] List = new int[H][W];
        for(int i=0;i<H;i++){
            String s = sc.next();
            for(int j=0;j<W;j++){
                if(s.charAt(j)=='.') List[i][j]=1;
                else List[i][j]=0;
            }
        }
        int max = 0;
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                int Dis[][] = new int[H][W];
                int Check[][] = new int[H][W];
                for(int k=0;k<H;k++) {
                    for (int l=0;l<W;l++){
                        if(List[k][l]==1) Dis[k][l]=999999999;
                        else Dis[k][l]=-1;
                        Check[k][l]=0;
                    }
                }
                if(List[i][j]==1){
                    Dis[i][j]=0;
                    Dis = Dijkstra(H,W,List,Dis,j,i);
                }
                for(int k=0;k<H;k++){
                    for(int l=0;l<W;l++){
                        if(max<Dis[k][l]&&Dis[k][l]!=999999999) max = Dis[k][l];
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static int[][] Dijkstra(int H, int W,int [][] List,int [][] Dis,int r,int c){
        if(r+1!=W){
            if(List[c][r+1]==1){
                if(Dis[c][r]+1<Dis[c][r+1]) {
                    Dis[c][r + 1] = Dis[c][r] + 1;
                    Dis = Dijkstra(H, W, List, Dis, r+1, c);
                }
            }
        }
        if(r-1!=-1){
            if(List[c][r-1]==1){
                if(Dis[c][r]+1<Dis[c][r-1]) {
                    Dis[c][r -1] = Dis[c][r] + 1;
                    Dis = Dijkstra(H, W, List, Dis, r-1, c);
                }
            }
        }
        if(c+1!=H){
            if(List[c+1][r]==1){
                if(Dis[c][r]+1<Dis[c+1][r]) {
                    Dis[c+1][r] = Dis[c][r] + 1;
                    Dis = Dijkstra(H, W, List, Dis, r, c+1);
                }
            }
        }
        if(c-1!=-1){
            if(List[c-1][r]==1){
                if(Dis[c][r]+1<Dis[c-1][r]) {
                    Dis[c-1][r] = Dis[c][r] + 1;
                    Dis = Dijkstra(H, W, List, Dis, r, c-1);
                }
            }
        }
        return Dis;
    }
}