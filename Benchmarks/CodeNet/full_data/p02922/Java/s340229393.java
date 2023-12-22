import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double y = Math.ceil((double)b/(double)a);
    System.out.println((int)y);
  }
}
