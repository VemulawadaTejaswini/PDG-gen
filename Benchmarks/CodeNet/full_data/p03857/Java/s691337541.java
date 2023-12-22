

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();

        boolean [][]roads = new boolean [N][N];
        boolean [][]rails = new boolean [N][N];

        for(int i=0;i<N;i++){
            roads[i][i] = true;
            rails[i][i]=true;
        }

        for(int i=0;i<K;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            roads[x-1][y-1]=true;
            roads[y-1][x-1]=true;
            for(int j=0;j<N;j++){
                if(roads[x-1][j]){
                    roads[y-1][j]=true;
                    roads[j][y-1]=true;
                }
                if(roads[y-1][j]){
                    roads[x-1][j]=true;
                    roads[j][x-1]=true;
                }
            }
        }

        for(int i=0;i<L;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            rails[x-1][y-1]=true;
            rails[y-1][x-1]=true;
            for(int j=0;j<N;j++){
                if(rails[x-1][j]){
                    rails[y-1][j]=true;
                    rails[j][y-1]=true;
                }
                if(rails[y-1][j]){
                    rails[x-1][j]=true;
                    rails[j][x-1]=true;
                }
            }
        }

        for(int i=0;i<N;i++){
            int cnt=0;
            for(int j=0;j<N;j++){
                if(roads[i][j]&&rails[i][j]){
                    cnt++;
                }
            }
            if(i<N)
                System.out.print(cnt+" ");
            else
                System.out.println(cnt);

        }



        sc.close();

    }

}
