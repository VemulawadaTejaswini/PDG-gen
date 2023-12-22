import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
     
      if(s.charAt(2).equals(s.charAt(3)) && s.charAt(4).equals(s.charAt(5)))
        System.out.println("yes");
      else System.out.println("no");
         
   }
}