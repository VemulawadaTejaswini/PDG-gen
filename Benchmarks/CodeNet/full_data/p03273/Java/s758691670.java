import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] A = new String[H];
        String[][] a = new String[H][W];
        int[] w = new int[W];
        int[] h = new int[H];
        int x = 0;

        for(int i=0; i<H; i++){
            A[i] = sc.next();
            for(int j=0; j<W; j++){
                a[i][j] = String.valueOf(A[i].charAt(j));
            }
        }
        for(int i=0; i<H; i++){
            h[i] = H;
            for(int j=0; j<W; j++){
                if(a[i][j].equals(".")){
                    x += 1;
                }
                else{
                    break;
                }
                if(j==W-1 && x==W){
                    h[i] = i;
                }
            }
            x = 0;
        }
        for(int i=0; i<W; i++){
            w[i] = W;
            for(int j=0; j<H; j++){
                if(a[j][i].equals(".")){
                    x += 1;
                }
                if(j==H-1 && x==H){
                    w[i] = i;
                }
            }
            x = 0;
        }
        for(int i=0; i<H; i++){
            if(i!=h[i]){
                for(int j=0; j<W; j++){
                    if(j!=w[j]){
                        System.out.print(a[i][j]);
                    }
                    if(j==W-1){
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}