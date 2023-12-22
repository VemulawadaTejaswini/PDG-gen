import java.util.*;
 
class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
 
      int a = scan.nextInt();
      int b = scan.nextInt();
      int X = scan.nextInt();
 
      int[] arr = new int[a+1];
      int   u, count = 0;
      int   abs, sum = 0;
      for(int i = 0; i < a+1; i++){
          arr[i] = 0;
          }
      for(int i = 0; i < b; i++){
          u      = scan.nextInt();
          arr[u] = 1;
          }
      if(X <= a + 1 - X){
         for(int i = 0; i  <X; i++){
             sum += arr[i];
             }
         }
      else{
          for(int i=b; i< X; i++){
              sum += arr[i];
              }
          }
     if(sum>=1){
       sum-=1;}
      System.out.println(sum);
   }
}