import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = scanner.nextInt();
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int r = n%k;
    int ans = Math.min(r, k-r);
    System.out.println(ans);
  }

	
}
