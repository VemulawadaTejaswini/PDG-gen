import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int a3 = sc.nextInt();
    int max = Math.max(a1, Math.max(a2, a3));
    int min = Math.min(a1, Math.min(a2, a3));
    int ans = max - min;
    
    System.out.println(ans);
  }
}