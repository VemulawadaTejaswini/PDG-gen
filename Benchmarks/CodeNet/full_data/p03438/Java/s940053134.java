import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     num = scan.nextInt();
      int     value = 0, count = 0, t;

      int[] A = new int[num];
      int[] B = new int[num];

      for(int i = 0; i < num; i++){
          A[i] = scan.nextInt();
          }
      for(int j = 0; j < num; j++){
          B[j] = scan.nextInt();
          }

      //Arrays.sort(A);
      //Arrays.sort(B);
      for(int i = 0; i < num; i++){
          if(A[i] < B[i]){
             do {
                A[i] += 2;
                value++;
                } while(A[i] <= B[i]);
             //System.out.println("value" + value);
             if(A[i] > B[i]){
                count += A[i] - B[i];
                //System.out.println(count);
                }
             }
          else if(A[i] == B[i]){
                  }
          else{
              count += A[i] - B[i];
              }
          }
      t = value - count;
      //System.out.println("cou" + count);
      if(t == 0 || t == 1){
         System.out.println("Yes");
         return;
         }
      else{
          System.out.println("No");
          return;
          }
   }
}
