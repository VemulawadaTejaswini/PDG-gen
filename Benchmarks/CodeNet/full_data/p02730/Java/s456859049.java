import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      String input = console.next();
      if(isPalindrome(input.substring(0, (input.length() - 1) / 2)) &&
         isPalindrome(input.substring(((input.length() + 3) / 2 - 1), input.length()))){
            System.out.println("Yes");
         }else{
            System.out.println("No");
         }
   }
   
   public static boolean isPalindrome(String s){
      String first = s.substring(0, (s.length() - 1)/2);
      String last = "";
      for(int i = s.length() - 1; i > (s.length() - 1) / 2; i--){
         last += s.charAt(i);
      }
      return first.equals(last);
   }
}