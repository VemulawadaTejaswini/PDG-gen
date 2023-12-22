import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A = 0;
    int B = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      A += x;
      B += Math.pow(x, 2);
    }
    System.out.println(B - (int)(Math.pow(A, 2)/n));
  }
}