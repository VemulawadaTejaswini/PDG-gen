import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int ab = a + b;
    int bc = b + c;
    int ca = c + a;
    
    if(a == bc || b == ca || c == ab) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}