import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      while(true) {
        int i = sc.nextInt();
        if(i == n - 1) {
          System.out.println("Vacant");
           System.out.flush();
          return;
        }
        if(i % 2 == 0) {
          System.out.println("Male");
          System.out.flush();
        }
        else {
          System.out.println("Female");
          System.out.flush();
        }
      }
     
  }
}