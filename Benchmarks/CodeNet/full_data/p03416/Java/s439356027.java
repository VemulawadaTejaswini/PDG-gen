import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     n     = scan.nextInt();
      int     v     = scan.nextInt();
      int     count = 0;

      int[] A = new int[5];
      for(int i = n; i <= v; i++){
          A[0]  = i;
          A[1]  = A[0] % 10;
          A[0] /= 10;
          A[2]  = A[0] % 10;
          A[0] /= 10;
          A[3]  = A[0] % 10;
          A[0] /= 10;
          A[4]  = A[0] % 10;
          A[0] /= 10;
          //for(int j = 0; j < 5; j++){
          //System.out.print(A[j]);
          //}
          //System.out.println();
          if(A[0] == A[1] && A[2] == A[4]){
             //System.out.println(A[0] + " " + A[4] + " " + A[2] + " " + A[1]);
             count++;
             }
          }
      System.out.println(count);
   }
}
