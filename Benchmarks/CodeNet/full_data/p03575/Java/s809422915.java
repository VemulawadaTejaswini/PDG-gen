import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        double[][] D = new double[N][N];
        for(int i = 0; i < N; i++){
            Arrays.fill(D[i], Double.POSITIVE_INFINITY);
        }
        for(int i = 0; i < N; i++){
            D[i][i] = 0;
        }
        int[][] a = new int[2][M];
        for(int i = 0; i < M; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            D[a[0][i]-1][a[1][i]-1] = 1;
            D[a[1][i]-1][a[0][i]-1] = 1;
        }
        sc.close();
       

        int count = 0;
        for(int l = 0; l < M; l++){
            int start = a[0][l];
            int end = a[1][l];
            D[start-1][end-1] = Double.POSITIVE_INFINITY;
            D[end-1][start-1] = Double.POSITIVE_INFINITY;
            double[][] D1 = new double[N][N];
            for(int x = 0; x < N; x++){
                for(int y = 0; y < N; y++){
                    D1[x][y] = D[x][y];
                }
            }
            for(int k = 0; k < N; k++){
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        D1[i][j] = Math.min(D1[i][j], D1[i][k]+D1[k][j]);
                    }
                }
            }
            
            if(!(isLink(D1)))
                count++;
            D[start-1][end-1] = 1;
            D[end-1][start-1] = 1;
        }

        System.out.println(count);
    }

    static boolean isLink(double[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == Double.POSITIVE_INFINITY)
                    return false;
            }
        }
        return true;
    }
}