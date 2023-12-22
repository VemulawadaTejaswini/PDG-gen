import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int n,m;
    static long mod = 998244353;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        int[][] a= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) a[i][j]=sc.nextInt();
        }
        int rank = getRank(a);
        long ans = (power(2,n+m-1)-power(2,n+m-rank-1)+mod)%mod;
        System.out.println(ans);
    }
    static long power(long base, long q){
        long ans = 1;
        while(q>0){
            if(q%2==1) ans = ans*base%mod;
            base = base*base%mod;
            q /= 2;
        }
        return ans;
    }
    static int getRank(int[][] A){
        int rank = 0;
        for(int j=0;j<m;j++){
            int pivot = -1;
            for(int i=rank;i<n;i++){
                if(A[i][j]>0){
                    pivot = i;
                    break;
                }
            }
            if(pivot<0) continue; // following col may still contains non-zero. need to go on
            if(pivot!=rank){ // swap the chosen line to the top of the concerned area
                for(int k=0;k<m;k++){
                    int c = A[pivot][k];
                    A[pivot][k] = A[rank][k];
                    A[rank][k] = c;
                }
            }
            for(int i=rank+1;i<n;i++){
                if(A[i][j]==0) continue;
                for(int k=j;k<m;k++) A[i][j]^=A[rank][k];
            }
            rank++;
        }
        return rank;
    }
}
