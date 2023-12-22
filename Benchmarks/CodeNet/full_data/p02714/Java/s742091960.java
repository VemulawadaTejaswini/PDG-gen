import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;

    
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          continue;
        }
        for (int k = 1; k <= n; k++) {
          if (k <= j) {
            continue;
          } else if (j-i == k-j) {
            continue;
          }
          
          String s1 = s.substring(i-1,i);
          String s2 = s.substring(j-1,j);
          String s3 = s.substring(k-1,k);
          if (!s1.equals(s2) && !s2.equals(s3) && !s3.equals(s1)) {
            ans += 1;
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}