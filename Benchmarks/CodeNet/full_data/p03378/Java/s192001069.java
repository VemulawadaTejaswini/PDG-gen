 import java.util.ArrayList;
import java.util.Scanner;
 class Main  {
     public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int m = scan.nextInt();
         int x = scan.nextInt();
         ArrayList<Integer> a = new ArrayList<>();
         for(int i = 0 ; i<m;i++){
             a.add(scan.nextInt());
         }
         int max ;
  
         int cost = 0 ;
         for(int i = 1 ; i< x ; i++){
             if(a.contains(i)){
                 cost++;
             }
         }
         
         int cost2 = 0 ;
         for(int i = x+1 ; i< n+1 ; i++){
             if(a.contains(i)){
                 cost2++;
             }
         }
         System.out.println(Math.min(cost,cost2));
     }
}
