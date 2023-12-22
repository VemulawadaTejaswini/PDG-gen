import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner       scan = new Scanner(System.in);
      String        st   = scan.next();
      StringBuilder str  = new StringBuilder(st);

      str.setCharAt(3, '8');

      System.out.println(str);
   }
}
