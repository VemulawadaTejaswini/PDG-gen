import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = a * b;
    
    if (a >= 10 || b >= 10) {
      System.out.println(-1);
    } else {
      System.out.println(total);
    }
  }
}