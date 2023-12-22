import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H][W];

        for(int i=0; i<H; i++){
            c[i] = sc.next().toCharArray();
        }

        int[][] L = new int[H][W];
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(j==0){
                    if(c[i][j]=='#'){
                        L[i][j] = 0;
                    }
                    else{
                        L[i][j] = 1;
                    }
                }
                else{
                    if(c[i][j]=='#'){
                        L[i][j] = 0;
                    }
                    else{
                        L[i][j] = L[i][j - 1] + 1;
                    } 
                }
            }
        }

        int[][] R = new int[H][W];
        for(int i=0; i<H; i++){
            for(int j=W-1; j>=0; j--){
                if(j==W-1){
                    if(c[i][j]=='#'){
                        R[i][j] = 0;
                    }
                    else{
                        R[i][j] = 1;
                    }
                }
                else{
                    if(c[i][j]=='#'){
                        R[i][j] = 0;
                    }
                    else{
                        R[i][j] = R[i][j + 1] + 1;
                    }
                }
            }
        }

        int[][] U = new int[H][W];
        for(int i=0; i<W; i++){
            for(int j=0; j<H; j++){
                if(j==0){
                    if(c[j][i]=='#'){
                        U[j][i] = 0;
                    }
                    else{
                        U[j][i] = 1;
                    }
                }
                else{
                    if(c[j][i]=='#'){
                        U[j][i] = 0;
                    }
                    else{
                        U[j][i] = U[j - 1][i] + 1;
                    }
                }
            }
        }
        
        int[][] D = new int[H][W];
        for(int i=0; i<W; i++){
            for(int j=H-1; j>=0; j--){
                if(j==H-1){
                    if(c[j][i]=='#'){
                        D[j][i] = 0;
                    }
                    else{
                        D[j][i] = 1;
                    }
                }
                else{
                    if(c[j][i]=='#'){
                        D[j][i] = 0;
                    }
                    else{
                        D[j][i] = D[j + 1][i] + 1;
                    }
                }
            }
        }
        int ans = 0;
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                int x = L[i][j] + R[i][j] + U[i][j] + D[i][j] - 3;
                ans = Math.max(ans, x);
            }
        }
        System.out.println(ans);
    }
}