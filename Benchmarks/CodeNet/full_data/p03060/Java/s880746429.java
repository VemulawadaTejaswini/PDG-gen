import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            int[][] S = new int[2][N];

            for(int i = 0 ; i< N ; i++){
                S[0][i] = sc.nextInt();
            }
            
            for(int i = 0 ; i< N ; i++){
                S[1][i] = sc.nextInt();
            }
        sc.close();

        int value = 0 ;
        int cost = 0 ;
        for(int i = 0 ; i < N ; i++){
            if(S[0][i] - S[1][i] > 0){
                value += S[0][i];
                cost += S[1][i];
            }
        }
        System.out.println(value-cost);
    }
}
