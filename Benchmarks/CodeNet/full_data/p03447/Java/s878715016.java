import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = X - A;
    System.out.println(C%B);
  }
}
