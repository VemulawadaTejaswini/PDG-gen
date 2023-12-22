import java.util.*;
class Main
{
 public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in);
   String one = s.next();
   String two = s.next();
   String three = s.next();
   String ans = one.charAt(2)+two.charAt(1)+three.charAt(0);
   System.out.println(ans);
   }
}
