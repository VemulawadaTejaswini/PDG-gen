import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int N = sc.nextInt();
    sc.close();
    
    int max = Math.max(H, W);
    
    int ans = (N + max - 1) / max;
    System.out.println(ans);    
  }
}