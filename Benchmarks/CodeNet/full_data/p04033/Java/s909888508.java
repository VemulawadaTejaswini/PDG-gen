import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 1;
    
    if(a<0 && b>0) {
      System.out.println("Zero");
    } else {
      for(int i=a; i<b+1; i++) {
        total *= i;
      }
      if(total>0) {
        System.out.println("Positive");
      } else {
        System.out.println("Negative");
      }
    }
  }
}