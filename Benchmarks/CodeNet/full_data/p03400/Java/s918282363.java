 
import java.util.ArrayList;
import java.util.Scanner;

  class Main  {
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
             for(int j = 0 ; j*arr[i]+1<=d ; j++){
                 day = j*arr[i]+1;
                 //System.out.print  (j*arr[i]+1 +" ");
                 count++;
                  
             }
             day = 0 ;
             //
             //System.out.println();
         }
         System.out.println(count+x);
     }
}
