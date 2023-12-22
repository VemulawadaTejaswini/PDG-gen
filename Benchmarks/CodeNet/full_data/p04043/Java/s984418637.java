import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if (a+b+c!=17) {
      System.out.println("NO");
      return;
    }
    
    if (a==5) {
      if (b==5 || b==7) {
        System.out.println("YES");
        return;
      }
      
      System.out.println("NO");
      return;
    }
    
    if (a==7) {
      if (b==5) {
        System.out.println("YES");
        return;
      }
      
      System.out.println("NO");
      return;
    }
    
    System.out.println("NO");
  }
}