import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int isPoor = 0;
    if (a == b && a != c) {isPoor = 1;}
    if (b == c && b != a) {isPoor = 1;}
    if (c == a && c != b) {isPoor = 1;}
    
    if (isPoor == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
  }
}