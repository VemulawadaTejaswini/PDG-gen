import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int NA = N*A;
        int[] x = new int[N];
        int[] sumfx = new int[N];
        int sumx = 0;
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
        }
        
        int[][][] p = new int[N+1][N+1][2501];
        p[0][0][0] = 1;
        
        for(int i=1;i<=N;i++){
            for(int j=0;j<=N;j++){
                for(int s=0;s<=2500;s++){
                    if(j>0&&(s-x[i-1])>=0){
                        p[i][j][s] = p[i-1][j][s] + p[i-1][j-1][s-x[i-1]];
                    }else{
                        p[i][j][s] = p[i-1][j][s];
                    }
                }
            }
        }
        
        long result = 0;
        for(int k=1;k<=N;k++){
            result += p[N][k][k*A];
        }
        
        System.out.println(result);
        
    }
}
