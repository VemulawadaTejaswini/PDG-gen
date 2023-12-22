import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] card = new int[M+1][3];

            for(int i = 1 ; i <= M ; i++){
                card[i][1] = sc.nextInt();
                card[i][2] = sc.nextInt();
            }
        sc.close();
        /*
        for(int i = 1 ; i <= M ; i++){
            System.out.print(card[i][1] + " ");
            System.out.print(card[i][2] + " ");
        }
        */
        int[] gate = new int[N+1];
        for(int i = 1 ; i <=M ; i++){
            for(int j = card[i][1] ; j <= card[i][2] ; j++){
                gate[j]++;
           }            
        }

        int count = 0;
        for(int i = 1 ; i <= N ; i++){
            if(gate[i] == M){
                count++;
            }
        }
        System.out.println(count);

   }
}
