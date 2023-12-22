import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N = scan.nextInt();
      int     A = scan.nextInt();
      int     B = scan.nextInt();
      int     sum = 0, mod = 0;
      int     n = 0;

      for(int j = 1; j <= N; j++){
          n = j;
          for(int i = 1; i <= 4; i++){
              mod += n % 10;
              n    = n / 10;
              }
          if(mod >= A && mod <= B){
             sum += j;
             }
          //System.out.println(j + "" + sum);
          mod = 0;
          }
      System.out.println(sum);
   }
}
