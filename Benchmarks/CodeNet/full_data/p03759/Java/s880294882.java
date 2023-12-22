import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int bMinusA = b - a;
    int cMinusB = c - b;
    
    int baAbs = Math.abs(bMinusA);
    int cbAbs = Math.abs(cMinusB);
    
    if (baAbs == cbAbs) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}