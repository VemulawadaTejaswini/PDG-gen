import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      long sum = 0;

      for(int i = 1; i < n+1; i++){
         if (i%3!=0) {
            if(i%5!=0){
               sum = sum + i;
            }
         }
      }
      System.out.println(sum);

   }

}