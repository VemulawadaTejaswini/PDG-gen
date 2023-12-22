import java.util.*;
    
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int ans = Math.max(0,Math.max(C,A) - Math.min(D,B));
    System.out.println(ans);
  }
}