import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        for(int i = 0; i < H; i++)
            S[i] = sc.next();
        sc.close();

        int[][] L = new int[H+2][W+2];
        int[][] R = new int[H+2][W+2];
        int[][] U = new int[H+2][W+2];
        int[][] D = new int[H+2][W+2];
        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= W; j++){
                if(S[i-1].charAt(j-1) == '#'){
                    L[i][j] = 0;
                } else {
                    L[i][j] = L[i][j-1]+1;
                }
            }
        }
        for(int i = 1; i <= H; i++){
            for(int j = W; j >= 1; j--){
                if(S[i-1].charAt(j-1) == '#'){
                    R[i][j] = 0;
                } else {
                    R[i][j] = R[i][j+1]+1;
                }
            }
        }

        for(int j = 1; j <= W; j++){
            for(int i = 1; i <= H; i++){
                if(S[i-1].charAt(j-1) == '#'){
                    U[i][j] = 0;
                } else {
                    U[i][j] = U[i-1][j]+1;
                }
            }
        }
        for(int j = 1; j <= W; j++){
            for(int i = H; i >= 1; i--){
                if(S[i-1].charAt(j-1) == '#'){
                    D[i][j] = 0;
                } else {
                    D[i][j] = D[i+1][j]+1;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(S[i].charAt(j) == '.'){
                    ans = Math.max(ans, L[i+1][j+1]+R[i+1][j+1]+U[i+1][j+1]+D[i+1][j+1]-3);
                }
            }
        }
        System.out.println(ans);
    }
}