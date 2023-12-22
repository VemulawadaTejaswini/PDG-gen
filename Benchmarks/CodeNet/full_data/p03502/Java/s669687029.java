import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt() ;
          if(n%f(n) == 0){
              System.out.println("Yes");
          }  else{
              System.out.println("No");
          }
      }
      static int f(int x ){
          String s = Integer.toString(x);
          char c[] = s.toCharArray();
          int sum = 0 ;
          for(int i = 0 ; i<c.length ; i++){
              sum+=Character.getNumericValue(c[i]);
          }
          return sum ;
      }
}