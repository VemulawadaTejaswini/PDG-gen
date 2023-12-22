import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     num = scan.nextInt();
      int     value = 0, count = 0;

      int[] A = new int[num];
      int[] B = new int[num];

      for(int i = 0; i < num; i++){
          A[i] = scan.nextInt();
          }
      for(int j = 0; j < num; j++){
          B[j] = scan.nextInt();
          }

      Arrays.sort(A);
      Arrays.sort(B);
      for(int i = 0; i < num; i++){
          if(A[i] < B[i]){
             for(int j = 0; A[i] < B[i] + 1; j++){
                 A[i] += 2;

                 value++;
                 }
             if(A[i] > B[i]){
                count += A[i] - B[i];
                //System.out.println(count);
                }
             }
          else{
              count += A[i] - B[i];
              }
          }
      if((value - count) % 2 != 0){
         System.out.println("No");
         return;
         }
      else{
          System.out.println("Yes");
          return;
          }
   }
}
