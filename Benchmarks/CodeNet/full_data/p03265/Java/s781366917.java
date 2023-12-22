import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    System.out.print(y2-y1+x2);
    System.out.print(" ");
    System.out.print(x1-x2+y2);
    System.out.print(" ");
    System.out.print(y2-y1+x1);
    System.out.print(" ");
    System.out.print(x1-x2+y1);
  }
  

  
}