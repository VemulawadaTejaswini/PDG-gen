import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] base_a = new int[N]; // 0 or 1
        int[] remainder_b = new int[N]; // 0 or 1
        for(int i = 0; i < N; i++){
            base_a[i] = scanner.nextInt();
            remainder_b[i] = 0;
        }
      
       /*
       * 最後の箱(Nコ目)の余り計算は、以下の箱のボールの個数に依存しない
       * そのため、最後の箱から余りを考えていくのが良さそう
       */
       for(int i = N-1; i >= 0; i--){
           int total_b = 0;
           
           for(int j = i; j < N; j += i+1){
                total_b += remainder_b[j];
           }
           
           if(base_a[i] == 1 && total_b % 2 == 0){
               remainder_b[i] = 1;
           } else if(base_a[i] == 0 && total_b % 2 == 1){
               remainder_b[i] = 1;
           }
       }
      
       int count_b = 0;
       for(int i = 0; i < N; i++){
           if(remainder_b[i] == 1){
               count_b++;
           }
       }
       System.out.print(count_b);

       System.out.println("");

       for(int i = 0; i < N; i++){
           if(remainder_b[i] == 1){
               System.out.print(i+1 + " ");
           }
       }
    }
}