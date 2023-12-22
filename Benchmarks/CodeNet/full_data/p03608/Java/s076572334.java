import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int[] tovisit=new int[r];
        for(int i=0;i<r;i++){
          tovisit[i]=sc.nextInt();
        }
        int[][][] warshall=new int[n+1][n][n];
        int a;
        int b;
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            warshall[0][i][j]=200000;
          }
        }
        for(int i=0;i,m;i++){
          a=sc.nextInt();
          b=sc.nextInt();
          warshall[0][a-1][b-1]=warshall[0][b-1][a-1]=sc.nextInt();
        }
        for(int i=1;i<n+1;i++){
          for(int j=0;j<n;j++{
            for(int k=0;k<n;k++){
              warshall[i][j][k]=Math.min(warshall[i-1][j][k],warshall[i-1][j][i]+warshall[i-1][i][k]);
            }
          }
        }
        
        
    }
 
    
}
