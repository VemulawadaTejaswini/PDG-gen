import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int D=sc.nextInt();
        int B[][]=new int[H*W+1][2];
        int dist[]=new int[H*W+1];

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                int a=sc.nextInt();
                B[a][0]=i;
                B[a][1]=j;
            }
        }

        for(int i=1;i<=D;i++){
            dist[i]=0;
            for(int j=1;i+D*j<=H*W;j++){
                dist[i+D*j]=dist[i+D*(j-1)]+Math.abs(B[i+D*j][0]-B[i+D*(j-1)][0])+Math.abs(B[i+D*j][1]-B[i+D*(j-1)][1]);
            }
        }

        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(dist[r]-dist[l]);
        }
        sc.close();
    }
}