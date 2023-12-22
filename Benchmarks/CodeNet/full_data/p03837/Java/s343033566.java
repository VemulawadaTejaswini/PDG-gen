import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] e=new int[m][3];
        long[][][] warshall=new long[n+1][n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                warshall[0][i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                e[i][j]=sc.nextInt();
            }
            warshall[0][e[i][0]-1][e[i][1]-1]=warshall[0][e[i][1]-1][e[i][0]-1]=e[i][2];
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    warshall[i][j][k]=Math.min(warshall[i-1][j][k],warshall[i-1][j][i-1]+warshall[i-1][i-1][k]);
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            if(warshall[n][e[i][0]-1][e[i][1]-1]<e[i][2]){
                ans++;
            }
        }
        System.out.println(ans);
    }

    
}