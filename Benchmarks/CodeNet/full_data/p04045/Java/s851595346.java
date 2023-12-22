import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] nonuse = new int[10];
    for(int i = 0; i < k; i++) {
      nonuse[sc.nextInt()] = 1; 
    }
    int ans = n;
    while(true) {
      int p = 0;
      for(int i = 0; i < ans.length(); i++) {
        int d = Integer.parseInt(String.valueOf(ans.charAt(i)));
        if(nonuse[d] == 1) p++;
      }
      if(p == 0) {
        break;
      } else {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
