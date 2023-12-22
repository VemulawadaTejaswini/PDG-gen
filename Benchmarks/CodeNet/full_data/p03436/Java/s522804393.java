import java.util.*;

public class Main{
    static double[][] D;
    static String[] S;
    static int H,W;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        H = sc.nextInt();
        W = sc.nextInt();
        S = new String[H];
        
        D = new double[H][W];
        for(int i = 0; i < H; i++){
            S[i] = sc.next();
        }
        sc.close();

        int count = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(S[i].charAt(j) == '#')
                    count++;
            }
        }
       
        for(int i = 0; i < H; i++){
           Arrays.fill(D[i], Double.POSITIVE_INFINITY);
        }
        D[0][0] = 0;

        dps(0, 0);

        /*for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }*/
        if(D[H-1][W-1] != Double.POSITIVE_INFINITY)
            System.out.println(H*W-(int)D[H-1][W-1]-count-1);
        else
            System.out.println(-1);
    }

    static void dps(int i, int j){
            if(i+1<H && S[i+1].charAt(j) == '.' ){
                if(D[i][j]+1 >= D[i+1][j]){}
                else {
                    D[i+1][j] = D[i][j]+1;
                    dps(i+1, j);
                }
            }
            if(i-1>=0 && S[i-1].charAt(j) == '.' ){
                if(D[i][j]+1 >= D[i-1][j]){}
                else {
                    D[i-1][j] = D[i][j]+1;
                    dps(i-1, j);
                }
            }
            if(j+1<W && S[i].charAt(j+1) == '.'){
                if(D[i][j]+1 >= D[i][j+1]){}
                else {
                    D[i][j+1] = D[i][j]+1;
                    dps(i, j+1);
                }
            }
            if(j-1>=0 && S[i].charAt(j-1) == '.'){
                if(D[i][j]+1 >= D[i][j-1]){}
                else {
                    D[i][j-1] = D[i][j]+1;
                    dps(i, j-1);
                }
            }

    }
}