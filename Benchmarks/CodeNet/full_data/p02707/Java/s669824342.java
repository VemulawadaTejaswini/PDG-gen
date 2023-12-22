import java.util.*;
class  Main{
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int t = scan.nextInt();
          while(t-- >0){
          int N= scan.nextInt();
          int arr[] =  new int[N];
          for(int i=1;i<N;i++)
               arr[i]= scan.nextInt();

          int count=1;
          int val = arr[1];
          int num=0;
          for(int i=1;i<N-1;i++){
              
              if(val==arr[i+1]){
                  count++;
              }
              else{
                  val = arr[i];
                  count=1;
                  System.out.println(count);
                  num++;
              }

          } 
          while(num!=N){
              num++;
              System.out.println(count);
              count=0;
          }     
          }
   }
}