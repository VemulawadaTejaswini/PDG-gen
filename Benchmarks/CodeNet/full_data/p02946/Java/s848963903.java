import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    
    int l = X - (K-1) >= -1000000 ? X - (K-1) : -1000000;
    int r = X + (K+1) <=  1000000 ? X + (K-1) :  1000000;
    for (int i = l; i <= r; i++) {
      System.out.print(i + " ");
    }
  }
}