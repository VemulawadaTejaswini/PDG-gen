import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int r = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    
    int x1 = r * x - d;
    int x2 = r * x1 - d;
    int x3 = r * x2 - d;
    int x4 = r * x3 - d;
    int x5 = r * x4 - d;
    int x6 = r * x5 - d;
    int x7 = r * x6 - d;
    int x8 = r * x7 - d;
    int x9 = r * x8 - d;
    int x10 = r * x9 - d;
    
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);
    System.out.println(x4);
    System.out.println(x5);
    System.out.println(x6);
    System.out.println(x7);
    System.out.println(x8);
    System.out.println(x9);
    System.out.println(x10);
  }
}