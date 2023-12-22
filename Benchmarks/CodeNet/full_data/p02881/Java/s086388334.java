import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long n = sc.nextLong();

      if(n<100000000){

      long m = (long)Math.sqrt(n);

      long a = m;
      long b = m;


      for (long i = 0; i < n; i++) {
         a = a + 1;
         if (n % a == 0) {
            break;
         }
      }

      for (long i = 0; i < n; i++) {
         b = b + 1;
         if (n % b == 0) {
            break;
         }
      }

      if(a + n / a < b + n / b){
         System.out.println(a + n / a - 2);
      }
      else{
         System.out.println(b + n / b - 2);
      }
   }

   else{
      if(n % 2 == 0){
         n = n / 2;

      long m = (long)Math.sqrt(n);

      long a = m;
      long b = m;


      for (long i = 0; i < n; i++) {
         a = a + 1;
         if (n % a == 0) {
            break;
         }

      }

      if(a * 2 + n / a < a + a * 2 / b){
         System.out.println(a * 2 + n / a - 2);
      }
      else{
         System.out.println(a + n * 2 / a - 2);
      }
   }
   else{
      
      long m = (long)Math.sqrt(n);

      long a = m;
      if(a%2==0){
         a= a + 1;
      }


      for (long i = 1; i < n; i++) {
         a = a - 2;
         if (n % a == 0) {
            break;
         }
      }
         System.out.println(a + n / a - 2);

   } 


   }

   }
}