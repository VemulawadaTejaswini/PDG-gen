import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int d[][] = new int[A][B];
        for(int i=0;i<A;++i){
            for(int j=0;j<B;++j){
                d[i][j] = scan.nextInt();
            }
        }
        int S=1;
        int T=202;
        //S+X, T-Y;
        int[][] dis = new int[T+1][T+1];
        for(int i=0;i<T+1;++i)for(int j=0;j<T+1;++j)dis[i][j]=-1;

        for(int i=0;i<A;++i){
            for(int j=B-2;j>=0;--j){
                int x = d[i][j+1]-d[i][j];
                if(j>0 && x > d[i][j] - d[i][j-1] ){
                    System.out.println("Impossible");
                    return;
                }
                if(x==0)continue;
                dis[S+x][T]=d[i][j] - (j+1)*x;
                if(x<0|| dis[S+x][T]<0){
                    System.out.println("Impossible");
                    return;
                }
            }
        }

        for(int j=0;j<B;++j){
            for(int i=A-2;i>=0;--i){
                int x = d[i+1][j]-d[i][j];
                if((i>0 && x > d[i][j] - d[i-1][j] )){
                    System.out.println("Impossible");
                    return;
                }
                if(x==0)continue;
                dis[S][T-x] = d[i][j] - (i+1)*x;
                if(x<0 || dis[S][T-x]<0){
                    System.out.println("Impossible");
                    return;
                }
            }
        }

        int N = T;
        int M = T-S;
        for(int i=0;i<T+1;++i)for(int j=0;j<T+1;++j)if(dis[i][j]>=0)++M;
        System.out.println(N+" "+M);
        for(int i=S;i<101;++i)System.out.println(i+" "+(i+1)+" "+'X');
        for(int i=101;i<T;++i)System.out.println(i+" "+(i+1)+" "+'Y');
        for(int i=0;i<T+1;++i)for(int j=0;j<T+1;++j)if(dis[i][j]>=0)System.out.println(i+" "+j+" "+dis[i][j]);
        System.out.println(S+" "+T);


    }
}