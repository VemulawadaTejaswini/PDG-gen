import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner       scan = new Scanner(System.in);
      String        sca  = scan.next();
      int           X    = Integer.parseInt(sca);
      StringBuilder str  = new StringBuilder(sca);
      int           Fx   = 0;

      int[] a = new int[str.length()];
      for(int i = 0; i < str.length(); i++){
          a[i] = Integer.parseInt("" + str.charAt(i));
          Fx  += a[i];
          }
      if(X % Fx == 0){
         System.out.println("Yes");
         }
      else{
          System.out.println("No");
          }
   }
}
