import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int a,b;
      a = sc.nextInt();
      b = sc.nextInt();

       int sum = a * b;

        if(sum % 3 == 0) {
             System.out.println("Yes");
        } else {
              System.out.println("No");
         }
  }
}