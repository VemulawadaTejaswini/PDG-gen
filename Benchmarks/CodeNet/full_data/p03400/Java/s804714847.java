 
import java.util.ArrayList;
import java.util.Scanner;

 class Main {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int d = scan.nextInt();
         int x = scan.nextInt();
         int arr[] = new int[n];
         
         for(int i = 0 ; i < n ; i++ ){
            arr[i] = scan.nextInt();
         }
         int day = 0 ; 
         int count = 0 ; 
         for(int i = 0 ; i < n ; i++){
             int j = 0 ;
             while(day <=  d ){
                 day = j*arr[i]+1;
                 count++;
                 j++;
             }
         }
         System.out.println(count+x);
     }
}
