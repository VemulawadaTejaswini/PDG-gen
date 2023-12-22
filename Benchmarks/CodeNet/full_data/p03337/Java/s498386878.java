import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int plus = a + b;
    int minus = a - b;
    int multi = a * b;
    
    if (plus >= minus && plus >= multi) {
      System.out.println(plus);
    } else if (minus >= plus && minus >= multi) {
      System.out.println(minus);
    } else if (multi >= plus && multi >= minus) {
      System.out.println(multi);
    }
  }
}