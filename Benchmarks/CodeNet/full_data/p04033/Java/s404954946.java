import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long total = 1;
    
    if(a<0 && b>0) {
      System.out.println("Zero");
    } else {
      for(int i=(int)a; i<(int)b+1; i++) {
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