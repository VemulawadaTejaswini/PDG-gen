import java.util.*;
 
public class Main{
    static int[][] d;
    static int N;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        int Q = sc.nextInt();
        int[][] a = new int[2][N-1];
        int[][] p = new int[2][Q];
        d = new int[N][N];
        for(int i = 0; i < N-1; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            d[a[0][i]-1][a[1][i]-1] = 1;
        }
        for(int i = 0; i < Q; i++){
            p[0][i] = sc.nextInt();
            p[1][i] = sc.nextInt();
        }
        sc.close();
 
        long[] count = new long[N];
        Arrays.fill(count, 0);
        for(int i = 0; i < N; i++){
            d[i][i] = 1;
        }
        dps(0, 0);
        for(int i = 0; i < Q; i++){
            for(int j = 0; j < N; j++){
                count[j] += p[1][i] * d[p[0][i]-1][j];
            }
        }
        for(int i = 0; i < N; i++)
            System.out.println(count[i]);
    }
 
    static void dps(int now, int before){
        if(now != 0){
            for(int i = now+1; i < N; i++){
                if(d[now][i] == 1){
                    d[before][i] = 1;
                }
            }
        }
        for(int i = now+1; i < N; i++){
            if(d[now][i] == 1){
                dps(i, now);
            }
        }
    }
}