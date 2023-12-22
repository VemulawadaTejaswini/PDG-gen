import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     hour  = scan.nextInt();
      int     money = scan.nextInt();
      int     bill  = scan.nextInt();

      if(hour * money >= bill){
         System.out.println(bill);
         }
      else{
          System.out.println(hour * money);
          }
   }
}
